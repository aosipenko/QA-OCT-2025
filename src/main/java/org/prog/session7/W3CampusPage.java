package org.prog.session7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class W3CampusPage extends AbstractPage {

    private static final String URL = "https://campus.w3schools.com/";

    public W3CampusPage(WebDriver driver) {
        super(driver, URL);
    }
}
