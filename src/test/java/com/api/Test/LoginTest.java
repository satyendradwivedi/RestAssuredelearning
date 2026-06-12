package com.api.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.Member;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.utils.ConfigReader;

import io.restassured.response.Response;

//@Listeners(com.api.listeners.TestListener.class)
public class LoginTest {

    private static final Logger logger = LogManager.getLogger(LoginTest.class);

    Member member;
    LoginRequest loginRequest;
    LoginResponse loginResponse;

    @Test(description = "Verify that a user can log in with valid credentials")
    public void login() {
        logger.info("Starting login test");
        member = new Member();

        // Read credentials from config.properties — no hardcoded values
        loginRequest = new LoginRequest(
            ConfigReader.get("login.emailAddress"),
            ConfigReader.get("login.password")
        );
        logger.info("Login request created with email: {}", loginRequest.getEmailAddress());

        Response response = member.login(loginRequest);
        logger.info("Login response received with status code: {}", response.getStatusCode());

        loginResponse = response.jsonPath().getObject("result", LoginResponse.class);

        System.out.println("First Name   : " + loginResponse.getFirstName());
        System.out.println("Last Name    : " + loginResponse.getLastName());
        System.out.println("Email        : " + loginResponse.getEmailAddress());
        System.out.println("UUID         : " + loginResponse.getUuid());
        System.out.println("Access Token : " + loginResponse.getAccessToken());
        System.out.println("Message      : " + loginResponse.getMessage());

        logger.info("User logged in successfully - Email: {}, UUID: {}", 
            loginResponse.getEmailAddress(), loginResponse.getUuid());

        Assert.assertEquals(response.getStatusCode(), 200, "Expected status code 200");
        Assert.assertNotNull(loginResponse.getAccessToken(), "Access token should not be null");
        logger.info("Login test completed successfully");
    }
}
