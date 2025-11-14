package org.prog.session11.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Random;

public class DemoSteps {

    private final static Random RAND = new Random();

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

    @Given("A step that rarely fails")
    public void aStepThatRarelyFails() {
        int i = RAND.nextInt(100);
        Assert.assertTrue(i > 5);
    }

    @Given("A step that sometimes fails")
    public void aStepThatSometimesFails() {
        int i = RAND.nextInt(100);
        Assert.assertTrue(i > 15);
    }

    @Given("A step that often fails")
    public void aStepThatOftenFails() {
        int i = RAND.nextInt(100);
        Assert.assertTrue(i > 35);
    }
}
