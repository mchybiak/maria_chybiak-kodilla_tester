package com.kodilla.abstracts.homework;

public abstract class Shape { //tworzę klasę abstrakcyjną Shape -> z tej klasy będą dziedziczyły inne klasy

    public Shape(){  // Konstruktor, bez przyjmowania argumentów,
        // wartości będą liczone na podstawie np. boku w poszczególnych klasach
    }
    public abstract double calculateSurfaceArea(); // Metoda abstrakcyjna -> liczenie SurfaceArea.
    // Każda klasa dziedzicząca po Shape będzie dodawała własną implementację.
    // Każda figura ma inny wzór na pole.
    public abstract double calculateCircuit(); // Metoda abstrakcyjna -> liczenie Circuit
    // Każda klasa dziedzicząca po Shape będzie dodawała własną implementację.
    // Każda figura ma inny wzór na obwód.
}
