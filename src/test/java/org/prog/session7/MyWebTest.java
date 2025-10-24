package org.prog.session7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyWebTest {

    private WebDriver driver;

    @BeforeSuite
    public void setUp(){
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void mySeleniumTest1() {
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30L));

        WebElement acceptCookies =
            webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("accept-choices")));
        acceptCookies.click();

        WebElement iFrameOuter = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(iFrameOuter);
        WebElement iFrameInner = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iFrameInner);

        WebElement header = driver.findElement(By.tagName("h1"));
        System.out.println(header.isDisplayed());
        header.click();
        driver.switchTo().defaultContent();
//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//        javascriptExecutor.executeScript("window.scrollBy(0,100)");

//        Actions actions = new Actions(driver);
//        actions.doubleClick();
//        actions.clickAndHold();
//        actions.release();
//        actions.perform();
    }

    @Test
    public void mySeleniumTest2() {
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30L));

        WebElement acceptCookies =
                webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("accept-choices")));
        acceptCookies.click();

        WebElement iFrameOuter = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(iFrameOuter);

        WebElement header = driver.findElement(By.tagName("h2"));
        System.out.println(header.isDisplayed());
        header.click();
        driver.switchTo().defaultContent();
    }
}