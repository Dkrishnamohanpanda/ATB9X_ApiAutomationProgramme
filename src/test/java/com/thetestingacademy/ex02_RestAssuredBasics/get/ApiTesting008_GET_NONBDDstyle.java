package com.thetestingacademy.ex02_RestAssuredBasics.get;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class ApiTesting008_GET_NONBDDstyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    @Description("Verify the get request positive")
    @Test
    public void test_GET_NonBddStyle (){
        String pin_code = "759014";

        r = RestAssured
                .given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/In/" + pin_code);

     response = r.when().log().all().get();

      vr = response.then()
                .log().all()
                .statusCode(200);

    }
    @Description("Verify the get request Negative -  -1 Input")
    @Test
    public void test_GET_NonBddStyle_Negative (){
        String pin_code = "-1";

        r = RestAssured
                .given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/In/" + pin_code);

        response = r.when().log().all().get();

        vr = response.then()
                .log().all()
                .statusCode(200);
    }

    @Description("Verify the get request Negative - 234453553455413413445213 Input")
    @Test
    public void test_GET_NonBddStyle_Negative2 (){
        String pin_code = "234453553455413413445213";

        r = RestAssured
                .given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/In/" + pin_code);

        response = r.when().log().all().get();

        vr = response.then()
                .log().all()
                .statusCode(200);

    }
    @Description("Verify the get request Negative -  Input")
    @Test
    public void test_GET_NonBddStyle_Negative3 (){
        String pin_code = " ";

        r = RestAssured
                .given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/In/" + pin_code);

        response = r.when().log().all().get();

        vr = response.then()
                .log().all()
                .statusCode(200);
    }
    @Description("Verify the get request Negative -  @@## Input")
    @Test
    public void test_GET_NonBddStyle_Negative4 (){
        String pin_code = "@@##";

        r = RestAssured
                .given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/In/" + pin_code);

        response = r.when().log().all().get();

        vr = response.then()
                .log().all()
                .statusCode(200);
    }
    @Description("Verify the get request Negative -  @@## Input")
    @Test
    public void test_GET_NonBddStyle_Negative5 (){
        String pin_code = " ";

        r = RestAssured
                .given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/In/" + pin_code);

        response = r.when().log().all().get();

        vr = response.then()
                .log().all()
                .statusCode(200);
    }
    @Description("Verify the get request Negative -  null Input")
    @Test
    public void test_GET_NonBddStyle_Negative6 (){
        String pin_code = "null";

        r = RestAssured
                .given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/In/" + pin_code);

        response = r.when().log().all().get();

        vr = response.then()
                .log().all()
                .statusCode(200);
    }
    @Description("Verify the get request Negative -  عَرَبِيّ Input")
    @Test
    public void test_GET_NonBddStyle_Negative7 (){
        String pin_code = "عَرَبِيّ";

        r = RestAssured
                .given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/In/" + pin_code);

        response = r.when().log().all().get();

        vr = response.then()
                .log().all()
                .statusCode(200);
    }
    @Description("Verify the get request Negative - 日本語 Input")
    @Test
    public void test_GET_NonBddStyle_Negative8 (){
        String pin_code = "日本語";

        r = RestAssured
                .given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/In/" + pin_code);

        response = r.when().log().all().get();

        vr = response.then()
                .log().all()
                .statusCode(200);
    }
}
