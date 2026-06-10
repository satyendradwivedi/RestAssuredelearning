package com.api.Test;

import com.api.base.Member;
import com.api.models.request.SignUpRequest;
import com.api.models.response.SignUpResponse;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(com.api.listeners.TestListener.class)
public class SignUpTestCase {

    private Faker faker;
    private Member member;
    SignUpRequest signUpRequest;
 
    private SignUpResponse signUpResponse;

    @BeforeClass
    public void setUp() {
        faker = new Faker();
        member = new Member();
         signUpRequest =  new SignUpRequest.Builder().
				setFirstName(faker.name().firstName())
				.setLastName(faker.name().lastName())
				.setEmailAddress("test" + System.currentTimeMillis() + "@yopmail.com")
				.setPhoneNumber(faker.number().digits(10))
				.setPassword("kJldFFfJ8El5zIaBztIXwA==")
				.setDateOfBirth("2000-06-03T11:06:51.478Z")
				.setJoinDate("2026-06-03T11:06:51.478Z")
				.setCountryId(1)
				.setTCvalidated(true)
				.setInviteCode(null)
				.setName(faker.name().fullName())
				.setCardNumber("4242424242424242")
				.setExpiryDate("0227")
				.setCvc("123").build();
        
    }

    @Test(description = "Verify successful user sign up")
    public void signUp() {
        Response response = member.signUp(signUpRequest);

        response.then().statusCode(200);

        signUpResponse = response.jsonPath().getObject("result", SignUpResponse.class);

        System.out.println("First Name   : " + signUpResponse.getFirstName());
        System.out.println("Last Name    : " + signUpResponse.getLastName());
        System.out.println("Email        : " + signUpResponse.getEmailAddress());
        System.out.println("UUID         : " + signUpResponse.getUuid());
        System.out.println("Access Token : " + signUpResponse.getAccessToken());
        System.out.println("Message      : " + signUpResponse.getMessage());
    }

   
    
}