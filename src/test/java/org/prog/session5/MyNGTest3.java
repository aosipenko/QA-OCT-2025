package org.prog.session5;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyNGTest3 {

    @Test
    public void myNgTest1() {
        System.out.println("hello Test NG");
    }

    @Test(dataProvider = "testDataProvider")
    public void myNgTest2(String input, String input2) {
        System.out.println(input + " " + input2);
//        Assert.assertTrue(input.contains("@"), "Input NOT contains @");
//        Assert.assertTrue(input.endsWith(".com"), "Input NOT ends with .com");
//        Assert.assertTrue(input2.contains("@"), "Input 2 NOT contains @");
//        Assert.assertTrue(input2.endsWith(".com"), "Input 2 NOT ends with .com");
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(input.contains("@"), "Input NOT contains @");
        sa.assertTrue(input.endsWith(".com"), "Input NOT ends with .com");
        sa.assertTrue(input2.contains("@"), "Input 2 NOT contains @");
        sa.assertTrue(input2.endsWith(".com"), "Input 2 NOT ends with .com");
        sa.assertAll();
        System.out.println("==========================");
    }

    @DataProvider
    public Object[][] testDataProvider() {
        return new Object[][]{
                {"someemail.com", "someemail"},
                {"some@email", "some@email.com"},
                {"some@email.com", "some@email"},
                {"some@email.com", "some@email.com"}
        };
    }
}
