package com.kodilla.abstracts.homework;


public class Square extends Shape{ // Tworzę klasę dziedziczącą po klasie Shape

    private double sideA;

    public Square(double sideA){
        super();
        this.sideA = sideA;
    }
    @Override
    public double calculateSurfaceArea() {
        double surfaceArea;
        surfaceArea = this.sideA * this.sideA;
        return surfaceArea;
    }

    @Override
    public double calculateCircuit() {
        double circuit;
        circuit = 4 * this.sideA;
        return circuit;
    }
}
