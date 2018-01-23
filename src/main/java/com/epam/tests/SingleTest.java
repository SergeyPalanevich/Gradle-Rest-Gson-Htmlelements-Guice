package com.epam.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SingleTest {

    private static final String URI = "http://jsonplaceholder.typicode.com";
    private static final String LOCATION = "/users";
    private static final int STATUS_CODE = 200;

    @Test
    public void getRequest(){
        RestAssured.baseURI = URI;
        Response response = RestAssured.given().get(LOCATION).andReturn();
        int statusCode = response.getStatusCode();
        assertEquals(statusCode, STATUS_CODE);
    }
}
