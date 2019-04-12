package com.fellows.employee.test.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fellows.employee.service.EmployeeService;
import com.fellows.employee.test.config.WebTestConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { WebTestConfig.class })
@WebAppConfiguration
public class EmployeeControllerTest {
	
	private MockMvc mockMvc;

	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setUp() {
		Mockito.reset(employeeService);
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void getAllEmployees() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/api").contentType(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers.status().isOk());
		Mockito.verify(employeeService, Mockito.times(1)).findAll();
	}
}
