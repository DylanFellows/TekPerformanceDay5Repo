package com.fellows.day4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fellows.day4.model.Employee;
import com.fellows.day4.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController
{
    @Autowired
    EmployeeService employeeService;
 
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
}
