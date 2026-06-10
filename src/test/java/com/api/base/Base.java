package com.api.base;

import static io.restassured.RestAssured.given;

import com.api.utils.ConfigReader;
import com.api.filters.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Base {

    private RequestSpecification requestSpecification;

    public Base() {
        requestSpecification = given()
            .baseUri(ConfigReader.get("base.url"));
    }

    static {
    	RestAssured.filters(new LoggingFilters());
    }
    public Response postRequest(Object payload, String endpoint) {
        return requestSpecification
            .log().all()
            .contentType(ContentType.JSON)
            .body(payload)
            .post(endpoint);
    }

    public void setAuthToken(String accessToken) {
        requestSpecification.header("Authorization", "Bearer " + accessToken);
    }

    public Response getRequest(String endpoint) {
        return requestSpecification
            .log().all()
            .get(endpoint);
    }
    
    public Response putRequest(Object payload, String endpoint) {
		return requestSpecification
			.log().all()
			.contentType(ContentType.JSON)
			.body(payload)
			.put(endpoint);
	}
}