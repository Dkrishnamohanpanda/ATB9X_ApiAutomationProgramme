package com.thetestingacademy.ex04_Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class ApiTesting025_RestAssured_Testng_Assertj_Assertions {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String token ; // Replace with your actual token
    Integer bookingId ; // Replace with the booking ID you want to use
    @Test
    public void test_POST() {
        String payload_POST = "{\n" +
                "        \"firstname\": \"Jim\",\n" +
                "        \"lastname\": \"Brown\",\n" +
                "        \"totalprice\": 111,\n" +
                "        \"depositpaid\": false,\n" +
                "        \"bookingdates\": {\n" +
                "            \"checkin\": \"2018-01-01\",\n" +
                "            \"checkout\": \"2019-01-01\"\n" +
                "        },\n" +
                "        \"additionalneeds\": \"Breakfast\"\n" +
                "}";

        // Set up the request specification
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking"); // POST doesn't require booking ID in the path
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload_POST).log().all();

        // Execute POST request
        response = requestSpecification.when().post();

        // Validate response
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);// Expecting 200 if successful

        validatableResponse.body("bookingid",Matchers.notNullValue());
        validatableResponse.body("booking.firstname",Matchers.equalTo("Jim"));
        validatableResponse.body("booking.lastname",Matchers.equalTo("Brown"));
        validatableResponse.body("booking.depositpaid",Matchers.equalTo(false));

   //extraction part
        bookingId =response.then().extract().path("bookingid");
        String firstname =response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");
     //Testng Assertion
        Assert.assertNotNull(bookingId);
        Assert.assertEquals(firstname,"jim");
        Assert.assertEquals(lastname,"Brown");

     //Assertj - 3rd lib to Assertion
        //if you are already extracted use function assertThat()
        //. (dot) is the builder pattern
        assertThat(bookingId).isNotNull().isNotZero().isPositive();
        assertThat(firstname).isEqualTo("Jim").isNotNull().isNotEmpty().isAlphanumeric().isNotBlank();



    }
}

