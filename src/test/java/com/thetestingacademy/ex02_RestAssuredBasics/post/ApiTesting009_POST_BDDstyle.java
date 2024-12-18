package com.thetestingacademy.ex02_RestAssuredBasics.post;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;


public class ApiTesting009_POST_BDDstyle {
    @Description("Verify the post request positive ")
    @Test
    public void test_post_bddStyle (){
        //url https://restful-booker.herokuapp.com


                String payload = "{\n" +
                        "    \"username\" : \"admin\",\n" +
                        "    \"password\" : \"password123\"\n" +
                        "}";

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all().body(payload)
                .when().log().all().post()
                .then().log().all().statusCode(200);
    }
}
