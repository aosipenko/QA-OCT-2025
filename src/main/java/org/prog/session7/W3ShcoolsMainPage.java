package org.prog.session7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class W3ShcoolsMainPage extends AbstractPage {

    private final static String URL = "https://www.w3schools.com/";

    public W3ShcoolsMainPage(WebDriver driver) {
        super(driver, URL);
    }

    public List<WebElement> listElements(By xpath) {
        return driver.findElements(xpath);
    }
}
