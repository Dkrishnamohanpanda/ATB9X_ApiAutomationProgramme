package com.thetestingacademy.ex02_RestAssuredBasics.get;

import io.restassured.RestAssured;

public class ApiTesting006_GET_BDDstyle {
    public static void main(String[] args) {
        String pincode = "560016";

        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/In/560016")
                .when().log().all().get()
                .then().log().all().statusCode(200);


        pincode = "-1";

        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/In/pincode")
                .when().log().all().get()
                .then().log().all().statusCode(404);
    }
}
