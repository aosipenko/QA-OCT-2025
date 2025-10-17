package org.prog.session5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;
import java.util.stream.Stream;

public class MyJUnitTest {

//    @BeforeAll
//    public static void setUp() {
//        System.out.println("-----------START OF ALL TESTS -----------");
//    }
//
//    @AfterAll
//    public static void tearDown() {
//        System.out.println("-----------END OF ALL TESTS -----------");
//    }
//
//    @BeforeEach
//    public void beforeTest() {
//        System.out.println("load rozetka.com.ua page");
//        System.out.println("Press side menu");
//        System.out.println("press shopping cart");
//    }
//
//    @AfterEach
//    public void afterTest() {
//        System.out.println("log out and got to about::blank");
//    }

    @Test
    public void test1() {
        System.out.println("Test closing shopping cart");
    }

    @Test
    public void test2() {
        System.out.println("Test purchasing with shopping cart");
        throw new RuntimeException("OOPS");
    }

    @Test
    public void test3() {
        System.out.println("Test purchasing with shopping cart");
    }

    @ParameterizedTest
    @ValueSource(strings = {"value 1", "value 2", "value 3"})
    public void test4(String s) {
        System.out.println(s);
    }

    @ParameterizedTest
    @MethodSource(value = "argumentsStream")
    public void test5(String s1, String s2) {
        System.out.println(s1);
        System.out.println(s2);
    }

    public static Stream<Arguments> argumentsStream() {
        Random random = new Random();
        return Stream.of(
                Arguments.of(
                        "test random number: " + random.nextInt(100),
                        "test second random number: " + random.nextInt(100)
                ),
                Arguments.of(
                        "test random number: " + random.nextInt(100),
                        "test second random number: " + random.nextInt(100)
                ),
                Arguments.of(
                        "test random number: " + random.nextInt(100),
                        "test second random number: " + random.nextInt(100)
                )
        );
    }
}
