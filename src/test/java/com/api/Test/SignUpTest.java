package com.api.Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import com.github.javafaker.Faker;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class SignUpTest {
	
	Faker faker;
	
	
	
	@Test(description = "This is sign up test")
	public void signUpTest() {

	    Faker faker = new Faker();

	    baseURI = "https://iamguru-memberapi-stage.azurewebsites.net/api";

	    String firstName = faker.name().firstName();
	    String lastName = faker.name().lastName();
	    String email = "test" + System.currentTimeMillis() + "@yopmail.com";
	    String phone = faker.number().digits(10);

	    String requestBody = String.format("""
	        {
	          "firstName": "%s",
	          "lastName": "%s",
	          "password": "kJldFFfJ8El5zIaBztIXwA==",
	          "phoneNumber": "%s",
	          "emailAddress": "%s",
	          "dateOfBirth": "2000-06-03T11:06:51.478Z",
	          "joinDate": "2026-06-03T11:06:51.478Z",
	          "countryId": 1,
	          "isTCvalidated": true,
	          "inviteCode": null,
	          "memberCardInfoReq": {
	            "name": "%s",
	            "cardNumber": "4242424242424242",
	            "expiryDate": "0227",
	            "cvc": "123"
	          }
	        }
	        """,
	        firstName,
	        lastName,
	        phone,
	        email,
	        firstName + " " + lastName
	    );

	    Response response =
	                     given()
	                    .header("Content-Type", "application/json")
	                    .body(requestBody)
	                    .when()
	                    .post("/Member/RegisterMember");
	                    

	    System.out.println("Status Code: " + response.getStatusCode());
	    System.out.println(response.asPrettyString());
	}
}