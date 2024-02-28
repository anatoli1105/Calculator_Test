package com.HomeWork.CalculatorTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest2 {
    public CalculatorServis calculator = new CalculatorServis();

    public static Stream<Arguments> argument() {
        return Stream.of(Arguments.of(6, 3),
                Arguments.of(1, 1),
                Arguments.of(8, 2));

    }

    @ParameterizedTest
    @MethodSource("argument")
    public void testForplus(int number1, int number2) {
        assertEquals((number1 + number2), calculator.plus(number1, number2));
    }

    @ParameterizedTest
    @MethodSource("argument")
    public void testForMinus(int number1, int number2) {
        assertEquals((number1 - number2), calculator.minus(number1, number2));
    }

    @ParameterizedTest
    @MethodSource("argument")
    public void testForDivide(int number1, int number2) {
        assertEquals((number1 * number2), calculator.divide(number1, number2));
    }

    @ParameterizedTest
    @MethodSource("argument")
    public void testForMultiply(int number1, int number2) {
        assertEquals((number1 / number2), calculator.multiply(number1, number2));
    }
}

