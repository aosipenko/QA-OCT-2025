package org.prog.session7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class AbstractPage {
    protected final WebDriver driver;
    protected final String URL;

    public AbstractPage(WebDriver driver, String url) {
        this.driver = driver;
        URL = url;
    }

    public void loadPage() {
        driver.get(URL);
    }

    public void acceptCookies() {
        List<WebElement> elements = driver.findElements(By.id("snigel-cmp-framework"));
        if (!elements.isEmpty()) {
            driver.findElement(By.id("accept-choices")).click();
        }
    }
}
