package com.fellows.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fellows.employee.model.Employee;
import com.fellows.employee.service.EmployeeService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
 
    @ApiOperation(value="This will return a list of all employees", response=Iterable.class)
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
    	List<Employee> employees = employeeService.getAllEmployees();
    	
		return employees;
	}
}
