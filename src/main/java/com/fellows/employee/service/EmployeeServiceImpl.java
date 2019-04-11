package com.fellows.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fellows.employee.dao.EmployeeDao;
import com.fellows.employee.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao repository;

	@Override
	public List<Employee> getAllEmployees() {
		 List<Employee> employee = (List<Employee>) repository.findAll();
	     return employee;
	}
}
