package org.prog.session6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//TODO: Go to allo.ua
//TODO: Search for iphone 17

public class MyWebTest {

    @Test
    public void mySeleniumTest1() {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
        driver.get("https://www.google.com");
//        WebElement runBtn = driver.findElement(By.id("runbtn"));
//        runBtn.click();
//        runBtn.sendKeys();
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.click();
        searchInput.sendKeys("Google");
        searchInput.sendKeys(Keys.ENTER);
        driver.quit();
    }
}