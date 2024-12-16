package com.thetestingacademy.ex02_RestAssuredBasics.get;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class ApiTesting007_GET_BDDstyle {

    @Test
    public void  test_GET_Req_Positive(){
        String pin_code = "388620";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/In/" + pin_code)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log().all()
                .statusCode(200);


    }

    @Test
    public void  test_GET_Req_Negative(){
        String pin_code = "-1";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/In/" + pin_code)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);


    }
}
