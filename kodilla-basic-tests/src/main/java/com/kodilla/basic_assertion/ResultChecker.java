package com.kodilla.basic_assertion;

public class ResultChecker {

    public static boolean assertEquals(int expected, int actual) {
        return expected == actual;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 4;
        int b = 2;
        int sumResult = calculator.sum(a, b);
        int subtractionResult = calculator.subtract(a,b);
        int powerAResult = calculator.powerA(a);
        int powerBResult = calculator.powerB(b);
        boolean correct = ResultChecker.assertEquals(9, sumResult) || ResultChecker.assertEquals(2,subtractionResult) || ResultChecker.assertEquals(16, powerAResult) || ResultChecker.assertEquals(4,powerBResult);
    }


}
