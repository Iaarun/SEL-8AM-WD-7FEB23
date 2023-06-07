package com.test.API8AMWDTest;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostReq {
	
	Payloads payload = new Payloads();
	GenerateTestData gtd = new GenerateTestData();
	
	public static String reqbody() {
		
		return "{\r\n"
				+ "    \"first_name\": \"Virat\",\r\n"
				+ "    \"last_name\": \"Kohli\",\r\n"
				+ "    \"email\": \"virat.kohli@indiatest.com\"\r\n"
				+ "}";
	}
//	@Test
	public void test_CreateUser() {
		RestAssured.baseURI="http://localhost:3000";
		
	Response response=	given()
		.body(reqbody())
		.contentType(ContentType.JSON)
		.when()
		.post("/employees")
		.then()
		.extract()
		.response();
	
	Assert.assertEquals(response.getStatusCode(), 201);
	
	 JsonPath jp= response.jsonPath();
	 
	  String name= jp.get("first_name");
	  Assert.assertEquals(name, "Virat");
		
		
	}
	
//	@Test
	public void test_CreateUserUsingPayload() {
		String f_name = gtd.getFirstName();
		String l_name= gtd.getLastName();
		String email = gtd.getEmail();
		RestAssured.baseURI="http://localhost:3000";
		
	Response response=	given()
		.body(payload.createEmployeePayload(f_name, l_name, email))
		.contentType(ContentType.JSON)
		.when()
		.post("/employees")
		.then()
		.log()
		.all()
		.extract()
		.response();
	
	Assert.assertEquals(response.getStatusCode(), 201);
	
	 JsonPath jp= response.jsonPath();
	 
	  String name= jp.get("first_name");
//	  Assert.assertEquals(name, "Virat");
		
		
	}
	
	@Test
	public void test_CreateUserUsingPojo() {
		String f_name = gtd.getFirstName();
		String l_name= gtd.getLastName();
		String email = gtd.getEmail();
		
		Employees employee = new Employees();
		employee.setFirstName(f_name);
		employee.setSecondName(l_name);
		employee.setEmail(email);
		employee.setJobTitle("QA Manager");
		RestAssured.baseURI="http://localhost:3000";
		
	Employees emp= given()
		.body(employee)
		.contentType(ContentType.JSON)
		.when()
		.post("/employees")
		.then()
		.log()
		.all()
		.extract()
		.as(Employees.class);
		
	
System.out.println(emp.getFirstName());
System.out.println(emp.getJobTitle());
	  
//	  Assert.assertEquals(name, employee.getFirstName());

}
}
