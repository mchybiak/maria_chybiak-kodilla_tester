package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.homework.Shape;

public class Triangle extends Shape { // Tworzę klasę dziedziczącą po klasie Shape

    double sideA = 2; // zmienna double -> bok trójkąta
    double sideB = 3; // zmienna double -> bok trójkąta
    double sideC = 4; // zmienna double -> bok trójkąta
    double height = 6; // zmienna double -> wysokość trójkąta
    double resultOfSurfaceArea = sideA*height*height; // zmienna wynik obliczenia pola trójkąta
    double resultOfCircuit = sideA+sideB+sideC; // zmienna wynik obliczenia obwodu trójkąta

    public Triangle(double surfaceArea, double circuit) {
        super(surfaceArea, circuit);
    }
    @Override
    public double calculateSurfaceArea() { //otrzymujemy szablon metody, której ciało możemy dodać wedle własnego uznania
        return resultOfSurfaceArea; // -> tutaj muszę dodać metodę, która oblicza surfaceArea triangle
    }

    @Override
    public double calculateCircuit() { //otrzymujemy szablon metody, której ciało możemy dodać wedle własnego uznania
        return resultOfCircuit; // -> tutaj muszę dodać metodę, która oblicza circuit triangle
    }
}

