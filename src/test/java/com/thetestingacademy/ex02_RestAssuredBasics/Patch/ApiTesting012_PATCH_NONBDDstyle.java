package com.thetestingacademy.ex02_RestAssuredBasics.Patch;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class ApiTesting012_PATCH_NONBDDstyle {

    @Description("Verify the PATCH request positive")
    @Test
    public void test_patch_NonbddStyle() {
        // Token and Booking ID
        String token = "648074ba36174cf";
        String bookingId = "26";

        // Payload for PATCH
        String payloadPATCH = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";

        // Set Base URI and Path
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        // Configure Request
        RequestSpecification request = RestAssured.given();
        request.basePath("/booking/" + bookingId);
        request.contentType(ContentType.JSON);
        request.cookie("token", token);
        request.body(payloadPATCH).log().all();

        // Send PATCH Request
        Response response = request.when().patch();

        // Validate Response
        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200); // Ensure 200 OK Status
    }
}


