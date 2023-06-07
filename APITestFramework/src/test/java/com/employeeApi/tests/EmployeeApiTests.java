package com.employeeApi.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.employeeApi.pojo.Employees;
import com.employeeApi.pojo.FavFoods;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class EmployeeApiTests {
	
	RequestSpecification requestSpecification;
	ResponseSpecification responseSpecification;
	
	Employees requestEmployeeData= new Employees();
	FavFoods favfood = new FavFoods();
	
	
	@BeforeClass
	public void beforeClass() {
		RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder().
				setBaseUri("http://localhost:3000")
				.setContentType(ContentType.JSON)
				.log(LogDetail.ALL);
		requestSpecification=requestSpecBuilder.build();
		
		ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder().
				expectContentType(ContentType.JSON).
				log(LogDetail.ALL);
		responseSpecification=responseSpecBuilder.build();
				
	}

	public void createEmployee() {
		String payload="{\r\n"
				+ "      \"first_name\": \"TestUser\",\r\n"
				+ "      \"last_name\": \"user1\",\r\n"
				+ "      \"email\": \"user1@codingthesmartway.com\",\r\n"
				+ "      \"favfood\": {\r\n"
				+ "        \"lunch\": \"chapati\",\r\n"
				+ "        \"breakfast\": \"idli\"\r\n"
				+ "      },\r\n"
				+ "      \"id\": 167\r\n"
				+ "    }";
		
		given(requestSpecification)
		.body(payload)
		.when().post("/employees")
		.then().spec(responseSpecification)
		.assertThat()
		.statusCode(201)
		.body("first_name", equalTo("TestUser"));
		
	}
	
//	@Test
	public void createEmployeeUsingPojo() {
		
		requestEmployeeData.setFirstName("Arun1");
		requestEmployeeData.setLastName("singh");
		requestEmployeeData.setEmail("userarun@test.com");
		favfood.setLunch("Dosa");
		favfood.setBreakfast("idli");
		requestEmployeeData.setFavFoods(favfood);
		
	Employees empresponse=	given(requestSpecification)
		.body(requestEmployeeData)
		.when().post("/employees")
		.then().spec(responseSpecification)
		.assertThat()
		.statusCode(201)
		.extract()
		.response()
		.as(Employees.class);
		
	assertThat(empresponse.getFirstName(), equalTo(requestEmployeeData.getFirstName()));
	assertThat(empresponse.getLastName(), equalTo(requestEmployeeData.getLastName()));
		
	}
	
	@Test
	public void getAnEmployee() {
			
		Employees empresponse=	given(requestSpecification)
		.when().get("/employees/168")
		.then().spec(responseSpecification)
		.assertThat()
		.statusCode(200)
		.extract()
		.response()
		.as(Employees.class);
		
		assertThat(empresponse.getFavFoods().getBreakfast(), equalTo(requestEmployeeData.getFavFoods().getBreakfast()));
	//	.body("first_name", equalTo("TestUser"), "favfood.breakfast", equalTo("idli"));
		
	}
}
