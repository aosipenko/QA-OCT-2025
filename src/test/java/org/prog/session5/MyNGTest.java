package org.prog.session5;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyNGTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("----- BEFORE SUITE -----");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("----- BEFORE METHOD -----");
    }

    @Test
    public void myNgTest1(){
        System.out.println("hello Test NG");
    }

    @Test
    public void myNgTest2(){
        System.out.println("hello Test NG");
    }

    @Test
    public void myNgTest3(){
        System.out.println("hello Test NG");
    }

    @Test
    public void myNgTest4(){
        System.out.println("hello Test NG");
    }
}
