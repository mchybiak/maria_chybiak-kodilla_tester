package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    private static double PI = 3.1415927;
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }


    @Override
    public double calculateSurfaceArea() {
        double surfaceArea;
        surfaceArea = PI * this.radius * this.radius;
        return surfaceArea;
    }

    @Override
    public double calculateCircuit() {
        double circuit;
        circuit = 2 * PI * this.radius;
        return circuit;
    }
}