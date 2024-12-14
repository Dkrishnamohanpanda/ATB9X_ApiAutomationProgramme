package com.thetestingacademy.ex01_samplecheck;

import io.restassured.RestAssured;

public class ApiTesting002 {
    public static void main(String[] args) {

        //Gherkin syntax
        //given() -prereq - URl,Auth,Headers,Body
        //when()- HTTP method - Get,Post,Patch,Delete
        //then() - validation- 200 ok,firstname


        //full url : https://api.zippopotam.us/In/560016
        //baseuri : https://api.zippopotam.us
        //Basepath : /In/560016

        RestAssured
                .given()
                   .baseUri(" https://api.zippopotam.us")
                   .basePath("/In/560016")
                .when()
                   .get()
                .then().log().all().statusCode(200);

    }
}
