package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.homework.Shape;

public class Rectangle extends Shape { // Tworzę klasę dziedziczącą po klasie Shape

    double sideA = 2; // zmienna double -> bok prostokąta
    double sideB = 4; // zmienna double -> bok prostokąta
    double resultOfSurfaceArea = sideA*sideB; // zmienna wynik obliczenia pola prostokąta
    double resultOfCircuit = 2*sideA+2*sideB; // zmienna wynik obliczenia obwodu prostokąta

    public Rectangle(double surfaceArea, double circuit) {
        super(surfaceArea, circuit);
    }
    @Override
    public double calculateSurfaceArea() { //otrzymujemy szablon metody, której ciało możemy dodać wedle własnego uznania
        return resultOfSurfaceArea; // -> tutaj muszę dodać metodę, która oblicza surfaceArea Rectangle
    }

    @Override
    public double calculateCircuit() { //otrzymujemy szablon metody, której ciało możemy dodać wedle własnego uznania
        return resultOfCircuit; // -> tutaj muszę dodać metodę, która oblicza circuit Rectangle
    }
}
