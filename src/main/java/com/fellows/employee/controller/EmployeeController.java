package com.fellows.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fellows.employee.service.EmployeeService;

import io.swagger.annotations.ApiOperation;

@Controller
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;
    
    public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
 
    @ApiOperation(value="This will return a list of all employees", response=Iterable.class)
	@GetMapping(value = "/api")
	public String findAll() {
    	employeeService.findAll();
		return "employee";
	}
}
