package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double c = 3;

        int sumResult = calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractionResult = calculator.subtract(a,b);
        boolean correctSubstraction = ResultChecker.assertEquals(-3, subtractionResult);
        if(correctSubstraction) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        }
        else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double squareResult= calculator.square(a, c);
        boolean correctSquare = ResultChecker.assertEquals(25, (int) squareResult);
        if(correctSquare) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        }
        else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }

    }
}
