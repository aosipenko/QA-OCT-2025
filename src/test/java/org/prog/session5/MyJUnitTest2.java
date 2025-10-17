package org.prog.session5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyJUnitTest2 {

    @BeforeAll
    public static void setUp() {
        System.out.println("-----------START OF ALL TESTS -----------");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("-----------END OF ALL TESTS -----------");
    }

    @Test
    public void test1() {
        System.out.println("test 3");
    }

    @Test
    public void test2() {
        System.out.println("test 4");
    }
}
