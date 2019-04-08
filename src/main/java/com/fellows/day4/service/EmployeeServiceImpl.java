package com.fellows.day4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fellows.day4.dao.EmployeeDao;
import com.fellows.day4.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;

	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}
}
