package com.fellows.employee.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShutdownController implements ApplicationContextAware {
     
    private ApplicationContext context;
     
    @PostMapping("/shutdownContext")
    public void shutdownContext() {
        ((ConfigurableApplicationContext)context).close();
    }
 
    @Override
    public void setApplicationContext(ApplicationContext applicationContext){
        this.context = applicationContext;
    }
}
