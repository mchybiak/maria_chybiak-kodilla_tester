package com.kodilla.abstracts.homework;

public class ShapeApplication {
    public static void main(String[] args) {
        Shape square = new Square(4.0);
        System.out.println("Surface area of square is: " + square.calculateSurfaceArea());
        System.out.println("Circuit of square is: " + square.calculateCircuit());

        Shape rectangle = new Rectangle(6.0, 4.0);
        System.out.println("Surface area of rectangle is: " + rectangle.calculateSurfaceArea());
        System.out.println("Circuit of rectangle is: " + rectangle.calculateCircuit());

        Shape circle = new Circle(5.0);
        System.out.println("Surface area of circle is: " + circle.calculateSurfaceArea());
        System.out.println("Circuit of circle is: " + circle.calculateCircuit());

    }
}
