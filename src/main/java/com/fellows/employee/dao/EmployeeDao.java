package com.fellows.employee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fellows.employee.model.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Long> {

}
