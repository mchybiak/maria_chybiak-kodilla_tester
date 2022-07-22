
// Utwórz trzy klasy dziedziczące po klasie Shape wraz z wymaganą implementacją.
// Działanie zaprezentuj w klasie Application.
// Utwórz klasę abstrakcyjną Job (zawód), z polami salary oraz responsibilities.
// Utwórz kilka konkretnych zawodów (klas dziedziczących po Job).
// W kolejnym kroku utwórz klasę Person, która zawierać będzie pola firstName, age i job.
// Dodaj metodę, która wyświetli obowiązki danej osoby w pracy.



package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int surfaceArea;
    private int circuit;

    public double sideA;
    public double sideB;

    public Shape(int surfaceArea, int circuit){
        this.surfaceArea = surfaceArea;
        this.circuit = circuit;
    }

    public int getSurfaceArea(){
        return surfaceArea;
    }

    public int getCircuit() {
        return circuit;
    }

    public abstract void calculateSurfaceArea();
    public abstract void calculateCircuit();

}
