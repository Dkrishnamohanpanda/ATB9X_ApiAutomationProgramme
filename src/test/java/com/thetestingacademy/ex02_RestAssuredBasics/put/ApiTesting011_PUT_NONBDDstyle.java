package com.thetestingacademy.ex02_RestAssuredBasics.put;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class ApiTesting011_PUT_NONBDDstyle {

    @Description("Verify the PUT request positive")
    @Test
    public void test_put_NonbddStyle() {
        String token = "648074ba36174cf";
        String bookingid = "4153";

        String payloadPUT = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        // Configure RestAssured request
        RequestSpecification request = RestAssured.given();
        request.baseUri("https://restful-booker.herokuapp.com");
        request.basePath("/booking/" + bookingid); // Correct usage
        request.contentType(ContentType.JSON);
        request.cookie("token", token);
        request.body(payloadPUT).log().all();

        // Execute PUT request
        Response response = request.when().put();

        // Validate response
        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200); // Expecting 200 if the update is successful
    }
}

