package org.prog.session7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

//TODO: Write page object for allo.ua with capacity to search for any goods
//TODO: Add check that at least 3 item names in search result contain "Apple iPhone 17 Pro"

public class MainPageTests extends AbstractTest {

    @Test
    public void validateCourseHeaders() {
        mainPage.loadPage();
        mainPage.acceptCookies();
        List<WebElement> courses =
                mainPage.listElements(By.xpath("//a[@class='ga-nav']"));
        Assert.assertTrue(courses.stream().anyMatch(e -> e.getText().equals("JAVA")));
        System.out.println("test");
    }
}
