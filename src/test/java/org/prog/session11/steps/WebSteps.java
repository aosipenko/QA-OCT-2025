package org.prog.session11.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.prog.session11.DataHolder;
import org.testng.Assert;

import java.util.List;

public class WebSteps {
    public static WebDriver driver;

    @Given("I load google page")
    public void loadGooglePage() {
        driver.get("https://www.google.com");
    }

    @Given("I accept google cookies if present")
    public void acceptGoogleCookies() {
        List<WebElement> cookieLink =
                driver.findElements(By.xpath("//a[contains(@href, 'gies/cookies')]"));
        if (cookieLink.size() > 0 && cookieLink.get(0).isDisplayed()) {
            driver.findElements(By.tagName("button")).get(5).click();
        }

    }

    @When("I send {string} first and last name to google search")
    public void sendPersonFirstLastNameAndLastNameToGoogleSearch(String alias) {
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.click();
        String value = (String) DataHolder.instance.get(alias);
        searchInput.sendKeys(value);
    }

    @Then("search dropdown appears")
    public void searchDropdownAppears() {
        List<WebElement> searchButtons = driver.findElements(By.name("btnK"));
        Assert.assertFalse(searchButtons.isEmpty());
        Assert.assertTrue(searchButtons.get(0).isDisplayed());
    }
}
