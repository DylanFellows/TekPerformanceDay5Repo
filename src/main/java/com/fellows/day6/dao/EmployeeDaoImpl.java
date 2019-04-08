package com.fellows.day6.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fellows.day6.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();

		Employee vo1 = new Employee();
		vo1.setId(1);
		vo1.setFirstName("Dylan");
		vo1.setLastName("Fellows");
		employees.add(vo1);

		Employee vo2 = new Employee();
		vo2.setId(2);
		vo2.setFirstName("Brianne");
		vo2.setLastName("Kesh");
		employees.add(vo2);

		return employees;
	}
}
