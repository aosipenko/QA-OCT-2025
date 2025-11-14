package org.prog.session12.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSteps {

    @Given("my first step")
    public void myFirstStepOld() {
        System.out.println("First step");
    }

    @Given("my first step has message {string}")
    public void myFirstStep(String message) {
        System.out.println("I want to print a message: " + message);
    }

    @When("My second step {string} is {string}")
    public void iPerformSecondStep(String step, String message) {
        System.out.println(step + " : " + message);
    }

    @Then("I test my enum value {}")
    public void iGetSomeResults(CucumberDemoEnum value) {
        System.out.println(value.name());
    }

    @When("I load page and {} cookies")
    public void loadPageAndCookies(CookiesChoice choice) {
        if (choice.equals(CookiesChoice.ACCEPT)) {
            System.out.println("Accept Cookies");
            choice.getSelector();
        } else {
            System.out.println("Reject Cookies");
        }
    }
}
