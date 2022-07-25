package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Job doctor = new Doctor();
        Person adam = new Person("Adam", 35, doctor);
        adam.printResponsibilities();
    }
}
