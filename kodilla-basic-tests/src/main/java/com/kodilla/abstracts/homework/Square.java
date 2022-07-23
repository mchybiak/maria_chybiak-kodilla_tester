package com.kodilla.abstracts.homework;

public class Square extends Shape{ // Tworzę klasę dziedziczącą po klasie Shape

    double sideA = 2; // zmienna double -> bok kwadratu
    double resultOfSurfaceArea = sideA*sideA; // zmienna wynik obliczenia pola kwadratu
    double resultOfCircuit = 4*sideA; // zmienna wynik obliczenia obwodu kwadratu

    public Square(double surfaceArea, double circuit) {
        super(surfaceArea, circuit);
    }
    @Override
    public double calculateSurfaceArea() { //otrzymujemy szablon metody, której ciało możemy dodać wedle własnego uznania
        return resultOfSurfaceArea; // -> tutaj muszę dodać metodę, która oblicza surfaceArea square
    }

    @Override
    public double calculateCircuit() { //otrzymujemy szablon metody, której ciało możemy dodać wedle własnego uznania
        return resultOfCircuit; // -> tutaj muszę dodać metodę, która oblicza circuit square
    }
}
