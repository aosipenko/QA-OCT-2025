package org.prog.session7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class AbstractTest {

    protected WebDriver driver;
    protected W3ShcoolsPage iFramePage;
    protected W3ShcoolsMainPage mainPage;

    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
        iFramePage = new W3ShcoolsPage(driver);
        mainPage = new W3ShcoolsMainPage(driver);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
