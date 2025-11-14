package org.prog.session12.steps;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import org.prog.session11.DataHolder;
import org.prog.session9.ResponseDto;

public class RestApiSteps {

    @Given("I request {int} random people as {string}")
    public void requestRandomPeople(int amount, String alias) {
        ResponseDto randomPersons = RestAssured.given()
                .baseUri("https://randomuser.me/")
                .basePath("/api")
                .queryParam("inc", "gender,name,nat")
                .queryParam("results", amount)
                .queryParam("noinfo")
                .get()
                .prettyPeek()
                .as(ResponseDto.class);
        DataHolder.instance.put(alias, randomPersons);
    }
}
