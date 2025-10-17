package org.prog.session5;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyNGTest2 {

    @BeforeTest
    public void beforeTest() {
        System.out.println("----- BEFORE TEST -----");
    }

    @Test
    public void myNgTest1(){
        System.out.println("hello Test NG");
    }
}
