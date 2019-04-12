package com.fellows.employee.test.config;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.fellows.employee.service.EmployeeService;

@Configuration
@ComponentScan(basePackages = "com.fellows.employee*", excludeFilters = {
		@Filter(type = FilterType.ANNOTATION, value = Configuration.class),
		@Filter(type = FilterType.ANNOTATION, value = Repository.class),
		@Filter(type = FilterType.ANNOTATION, value = Service.class) })
public class WebTestConfig {

	@Bean
	public EmployeeService employeeService() {
		return Mockito.mock(EmployeeService.class);
	}
}
