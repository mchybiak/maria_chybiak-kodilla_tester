package com.kodilla.abstracts.homework;

public abstract class Shape { //tworzę klasę abstrakcyjną Shape -> z tej klasy będą dziedziczyły inne klasy

    private double surfaceArea; // klasa przechowuje zmienną int surfaceArea.
    // Double, ponieważ wynik może nie być liczbą całkowitą.

    private double circuit; // klasa przechowuje zmienną int polę powierzchni.
    // Double, ponieważ wynik może nie być liczbą całkowitą

    public Shape(double surfaceArea, double circuit){  // tworzymy konstruktor.
        // Jest potrzebny do tworzenia nowych obiektów w póżniejszym czasie?
        this.surfaceArea = surfaceArea;
        this.circuit = circuit;
    }

    public double getSurfaceArea(){
        return surfaceArea;
    } // Getter wydobywający wartość prywatnej zmiennej surfaceArea

    public double getCircuit() {
        return circuit;
    } // Getter wydobywający wartość prywatnej zmiennej Circuit

    public abstract double calculateSurfaceArea(); // Metoda abstrakcyjna -> liczenie SurfaceArea.
    // Każda klasa dziedzicząca po Shape będzie dodawała własną implementację. Każda figura ma inny wzór na pole.
    public abstract double calculateCircuit(); // Metoda abstrakcyjna -> liczenie Circuit
    // Każda klasa dziedzicząca po Shape będzie dodawała własną implementację. Każda figura ma inny wzór na obwód.
}
