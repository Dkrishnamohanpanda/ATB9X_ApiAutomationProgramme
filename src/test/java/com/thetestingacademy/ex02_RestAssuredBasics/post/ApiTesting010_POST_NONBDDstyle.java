package com.thetestingacademy.ex02_RestAssuredBasics.post;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class ApiTesting010_POST_NONBDDstyle {
    @Description("Verify the post request positive ")
    @Test
    public void test_post_NonbddStyle (){
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);

        Response response1 = r.when().log().all().post();

        ValidatableResponse vr1 = response1.then().log().all().statusCode(200);
    }
}
