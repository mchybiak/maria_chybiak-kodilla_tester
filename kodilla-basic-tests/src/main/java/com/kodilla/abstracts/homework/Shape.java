package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int surfaceArea;
    private int circuit;

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

    public abstract double calculateSurfaceArea();
    public abstract double calculateCircuit();

}
