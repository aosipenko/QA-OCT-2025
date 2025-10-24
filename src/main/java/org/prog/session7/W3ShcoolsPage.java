package org.prog.session7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class W3ShcoolsPage extends AbstractPage {
    private static final String URL = "https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width";

    public W3ShcoolsPage(WebDriver driver) {
        super(driver, URL);
    }

    public void switchToFrame(By by) {
        WebElement iFrameOuter = driver.findElement(by);
        driver.switchTo().frame(iFrameOuter);
    }

    public void exitFrame() {
        driver.switchTo().defaultContent();
    }

    public boolean elementExists(By by) {
        return driver.findElement(by).isDisplayed();
    }
}
