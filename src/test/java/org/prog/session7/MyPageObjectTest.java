package org.prog.session7;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyPageObjectTest extends AbstractTest {

    @BeforeMethod
    public void beforeMethod() {
        iFramePage.loadPage();
        iFramePage.exitFrame();
        iFramePage.acceptCookies();
    }

    @Test
    public void myPageObjectTest1() {
        iFramePage.switchToFrame(By.id("iframeResult"));
        iFramePage.switchToFrame(By.tagName("iframe"));
        iFramePage.elementExists((By.tagName("h1")));
    }

    @Test
    public void myPageObjectTest2() {
        iFramePage.switchToFrame(By.id("iframeResult"));
        iFramePage.elementExists((By.tagName("h2")));
    }
}
