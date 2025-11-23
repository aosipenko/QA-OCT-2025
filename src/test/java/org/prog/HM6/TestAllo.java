package org.prog.HM6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestAllo {

    @Test
    public void mySeleniumTestAllo() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://allo.ua/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement searchInput = driver.findElement(By.id("search-form__input"));
        searchInput.click();
        searchInput.sendKeys("Iphone 17");
        searchInput.sendKeys(Keys.ENTER);
        driver.quit();
    }
}
