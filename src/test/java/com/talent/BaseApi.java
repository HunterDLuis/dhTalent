package com.talent;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//Nos va a servir para abstraer y conectarnos al API
public abstract class BaseApi {

    protected final static String BASE_URL = "https://swapi.dev/api/";
    //Obtenemos el API
    protected static Response getRequestResponse(String response){
        RestAssured.baseURI = BASE_URL;
        RequestSpecification httpRequest = RestAssured.given();
        return httpRequest.get(response);
    }
}
