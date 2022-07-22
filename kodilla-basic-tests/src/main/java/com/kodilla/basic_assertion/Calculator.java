package com.kodilla.basic_assertion;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int powerA(int a){
        return a*a;
    }

    public int powerB(int b){
        return b*b;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;
        int sumResult = calculator.sum(a, b);
        int subtractionResult = calculator.subtract(a,b);
        int powerAResult = calculator.powerA(a);
        int powerBResult = calculator.powerB(b);
    }
}
