package com.test.API8AMWDTest;

import com.github.javafaker.Faker;

public class GenerateTestData {
	Faker faker = new  Faker();
	
	String firstName;
	String lastName;
	String email;
//	public static void main(String[] args) {
//		GenerateTestData  gtd = new GenerateTestData();
//		System.out.println(gtd.getFirstName());
//		System.out.println(gtd.getLastName());
//		System.out.println(gtd.getEmail());
//	}
	
	public String getFirstName() {
		firstName= faker.name().firstName();
		return firstName;
	}
	
	public String getEmail() {
		email= firstName+"."+lastName+"@indiatest.com";
		return email;
	}

	public String getLastName() {
		lastName= faker.name().lastName();
		return lastName;
	}
	
	


}
