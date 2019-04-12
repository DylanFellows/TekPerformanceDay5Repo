package com.fellows.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fellows.employee.model.Employee;

@Service
public interface EmployeeService {
	  public List<Employee> findAll();
}
