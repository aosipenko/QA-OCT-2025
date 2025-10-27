package org.prog.session8;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
//TODO: GPT THIS
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

//TODO: Add "location" query param to request
//TODO: Add validation that city is not null
//TODO: Print timezone.description

public class MyRestTest {

    @Test
    public void myRestTest() {
//        RestAssured.get("https://randomuser.me/api?inc=gender,name,nat&noinfo");
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://randomuser.me/");
        requestSpecification.basePath("/api");
        requestSpecification.queryParam("inc", "gender,name,nat");
        requestSpecification.queryParam("noinfo");

        Response response = requestSpecification.get();
        response.prettyPrint();
        String s = response.jsonPath().get("results[0].name.first");

        ValidatableResponse validatableResponse = response.then();
        validatableResponse.statusCode(200);
        validatableResponse.contentType(ContentType.JSON);
        //TODO: showcase search by values
        validatableResponse.body("results[0].gender", Matchers.equalTo("male"));
    }

    @Test
    public void myRestTest2() {
//        RestAssured.get("https://randomuser.me/api?inc=gender,name,nat&noinfo");
        RestAssured.given()
                .baseUri("https://randomuser.me/")
                .basePath("/api")
                .queryParam("inc", "gender,name,nat")
                .queryParam("results", "5")
                .queryParam("noinfo")
                .get()
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("results[0].gender", Matchers.equalTo("male"));
    }
}
