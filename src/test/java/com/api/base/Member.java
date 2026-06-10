package com.api.base;

import java.util.Map;

import com.api.models.request.LoginRequest;

import io.restassured.response.Response;

public class Member extends Base {

    private static final String BASE_PATH = "https://iamguru-memberapi-stage.azurewebsites.net/api/Member/";

    public Response signUp(Object payload) {
        return postRequest(payload, BASE_PATH + "RegisterMember");
    }

    public Response login(Object payload) {
        return postRequest(payload, BASE_PATH + "Login");
    }

    public Response getProfile(String accessToken) {
        setAuthToken(accessToken);                        // fixed: was accessToken()
        return getRequest(BASE_PATH);
    }
    
    public Response updateProfile(Map<String, Object> updatePayload, String accessToken) {
		setAuthToken(accessToken);
		return putRequest(updatePayload, BASE_PATH + "Update");
	}
}
