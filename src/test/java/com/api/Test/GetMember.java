package com.api.Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.Member;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.utils.ConfigReader;

import io.restassured.response.Response;
@Listeners(com.api.listeners.TestListener.class)

public class GetMember {

	
	Member member;
	LoginRequest loginRequest;
	
	@Test(description = "List of all members")
	
	public void getMember() {
		
		member = new Member();
		
		loginRequest = new LoginRequest(
	            ConfigReader.get("login.emailAddress"),
	            ConfigReader.get("login.password")
	        );

	        Response response = member.login(loginRequest);
	        LoginResponse loginResponse = response.jsonPath().getObject("result", LoginResponse.class);
	        String accessToken = loginResponse.getAccessToken();
	        
	        System.out.println("Access Token: " + accessToken);
		
			
			  Response getProfileResponse = member.getProfile(loginResponse.getAccessToken()); 
			 System.out.println("Get Profile Response: " + getProfileResponse.asPrettyString());
		
		
				
	}
}
