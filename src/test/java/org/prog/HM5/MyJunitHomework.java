package org.prog.HM5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.prog.HM4.Random.getRandomColor;
import static org.prog.HM4.Random.getRandomResolution;

public class MyJunitHomework {

    // TODO: Move assignement from ListPractice to JUnit
    // TODO: Make resolution and color parameters of the test

    @ParameterizedTest
    @ValueSource(strings = {"black", "white", "blue"})
    public void test1(String s) {
        System.out.println(s);
    }

    @ParameterizedTest
    @ValueSource(strings = {"2340x1080", "2532x1170", "2796x1290"})
    public void test2(String r) {
        System.out.println(r);
    }

    @ParameterizedTest
    @MethodSource(value = "argumentsStream")
    public void test3(String s1, String s2) {
        System.out.println(s1);
        System.out.println(s2);
    }

    public static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(
                        "color: " + getRandomColor(),
                        "resolution: " + getRandomResolution()
                ),
                Arguments.of(
                        "color: " + getRandomColor(),
        "resolution: " + getRandomResolution()
                ),
                Arguments.of(
                        "color: " + getRandomColor(),
                        "resolution: " + getRandomResolution()
                )
        );
    }
}
