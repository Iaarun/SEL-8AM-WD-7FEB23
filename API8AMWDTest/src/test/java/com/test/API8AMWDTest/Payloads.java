package com.test.API8AMWDTest;

import java.util.HashMap;

public class Payloads {
	
	public HashMap<String, String> createEmployeePayload(String firstName, String lastName, String email) {
		HashMap<String , String> reqpayload = new HashMap<String, String>();
		
		reqpayload.put("first_name", firstName);
		reqpayload.put("last_name", lastName);
		reqpayload.put("email", email);
		
		return reqpayload;
	}

}
