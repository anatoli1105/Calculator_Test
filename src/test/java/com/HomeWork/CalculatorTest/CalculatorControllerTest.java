package com.HomeWork.CalculatorTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {
    public CalculatorServis calculator = new CalculatorServis();

    @Test
    void plus() {
        Assertions.assertEquals(4, calculator.plus(2, 2));
        Assertions.assertEquals(3, calculator.plus(1, 2));
        Assertions.assertEquals(10, calculator.plus(8, 2));
        Assertions.assertEquals(0, calculator.plus(0, 0));

    }

    @Test
    void minus() {
        Assertions.assertEquals(0, calculator.minus(2, 2));
        Assertions.assertEquals(3, calculator.minus(5, 2));
        Assertions.assertEquals(10, calculator.minus(12, 2));
        Assertions.assertEquals(0, calculator.minus(0, 0));
    }

    @Test
    void multiply() {
        Assertions.assertEquals(1, calculator.multiply(2, 2));
        Assertions.assertEquals(3, calculator.multiply(6, 2));
        Assertions.assertEquals(10, calculator.multiply(20, 2));
        Assertions.assertEquals(4, calculator.multiply(8, 2));
    }

    @Test
    void testForMultiplyException() {


        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.multiply(2, 0));
    }

    @Test
    void divide() {
        Assertions.assertEquals(4, calculator.divide(2, 2));
        Assertions.assertEquals(12, calculator.divide(6, 2));
        Assertions.assertEquals(40, calculator.divide(20, 2));
        Assertions.assertEquals(16, calculator.divide(8, 2));


    }


}