package com.api.Test;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.Member;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.utils.ConfigReader;

import io.restassured.response.Response;

public class UpdateMember {

    @Test(description = "Update member profile")
    public void updateMember() {

        Member member = new Member();

        LoginRequest loginRequest = new LoginRequest(
                ConfigReader.get("login.emailAddress"),
                ConfigReader.get("login.password"));

        // Login
        Response loginResponseAPI = member.login(loginRequest);

        Assert.assertEquals(loginResponseAPI.getStatusCode(), 200,
                "Login failed");

        LoginResponse loginResponse =
                loginResponseAPI.jsonPath().getObject("result", LoginResponse.class);

       
        
        LoginRequest lg=new LoginRequest.Builder().emailAddress("satya@yopmail.com").password("kJldFFfJ8El5zIaBztIXwA==").build();
        
       Response response= member.putRequest(lg, loginResponse.getAccessToken());
       
       System.out.println(response.asPrettyString());
       
        

    }
}