package com.fellows.day5.test.controller;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmployeeControllerTest.class)
public class EmployeeControllerTest {

	final static String HOST = "http://localhost:8080";
	final static String API = "/api";
	final static String GET_ALL_EMPLOYEES_PATH = HOST + API + "/employee/getAllEmployees";

	@Test
	public void getAllEmployees() {
		given().when().get(GET_ALL_EMPLOYEES_PATH).then().statusCode(200);
	}

}
