package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubstract () {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.subtract(a, b);
        assertEquals(-3, subResult);
    }

    @Test
    public void testSquareAbove0 () {
        Calculator calculator = new Calculator();
        int a = 5;
        int squareResult = (int) calculator.square(5, 3);
        assertEquals(125, squareResult,0.01 );
    }
    @Test
    public void testSquare0 () {
        Calculator calculator = new Calculator();
        int a = 0;
        int squareResult = (int) calculator.square(0, 3);
        assertEquals(0, squareResult,0.01 );
    }
    @Test
    public void testSquareBelow0 () {
        Calculator calculator = new Calculator();
        int a = -5;
        int squareResult = (int) calculator.square(-5, 3);
        assertEquals(-125, squareResult,0.01 );
    }


}
