package org.prog.session10.steps;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import org.prog.session9.ResponseDto;

public class RestApiSteps {

    public static ResponseDto randomPersons;

    @Given("I request {int} random people from random user service")
    public void requestRandomPeople(int amount) {
        randomPersons = RestAssured.given()
                .baseUri("https://randomuser.me/")
                .basePath("/api")
                .queryParam("inc", "gender,name,nat")
                .queryParam("results", amount)
                .queryParam("noinfo")
                .get()
                .prettyPeek()
                .as(ResponseDto.class);
    }
}
