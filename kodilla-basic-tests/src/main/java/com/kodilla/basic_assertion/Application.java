package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 4;
        int sumResult = calculator.sum(a, b);
        int subtractionResult = calculator.subtract(a,b);
        int powerAResult = calculator.powerA(a);
        int powerBResult = calculator.powerB(b);
        boolean correct = ResultChecker.assertEquals(9, sumResult) || ResultChecker.assertEquals(2,subtractionResult) || ResultChecker.assertEquals(16, powerAResult) || ResultChecker.assertEquals(4,powerBResult);
        if (correct) {
            System.out.println("Metoda sum oraz różnic oraz potęg działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum oraz różnic oraz potęg nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}
