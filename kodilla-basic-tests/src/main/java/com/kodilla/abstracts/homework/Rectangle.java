package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB){
        super();
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public double calculateSurfaceArea() {
        double surfaceArea;
        surfaceArea = this.sideA * this.sideB;
        return surfaceArea;
    }

    @Override
    public double calculateCircuit() {
        double circuit;
        circuit = 2 * this.sideA + 2 * this.sideB;
        return circuit;
    }
}
