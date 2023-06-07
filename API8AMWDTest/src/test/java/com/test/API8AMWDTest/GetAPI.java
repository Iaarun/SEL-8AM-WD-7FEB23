package com.test.API8AMWDTest;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetAPI {
	
//	@Test
	public void test_singleUserAPi() {
		 RestAssured.baseURI="http://localhost:3000";
		 
	Response response=	 given()
		 .when()
		 .get("/employees/vmDMTBQ")
		 .then()
		 .extract()
		 .response();
	
	System.out.println(response.asPrettyString());
	
	Assert.assertEquals(response.getStatusCode(), 200);
	
	  JsonPath jp= response.jsonPath();
	  
	  String name = jp.get("first_name");
	  Assert.assertEquals(name, "Virat");
	  
	String contentype=  response.getContentType();
	
	Assert.assertTrue(contentype.contains("application/json"));
	 String date= response.getHeader("Date");
	 System.out.println(date);
		 
	}

	@Test
	public void test_getallempoyees() {
		 RestAssured.baseURI="http://localhost:3000";
		 
	Response response=	 given()
		 .when()
		 .get("/employees")
		 .then()
		 .extract()
		 .response();
	
	Assert.assertEquals(response.getStatusCode(), 200);
	 JsonPath jp= response.jsonPath();
	 
	  String name= jp.get("[1].first_name");
	  Assert.assertEquals(name, "Steve");
	
	  System.out.println(response.asPrettyString());
		 
		 
	}
}
