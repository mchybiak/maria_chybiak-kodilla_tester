package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        String username = "John";
        String[] nameParts = username.split(" "); // jako miejsce rozdzielające przyjęta jest spacja
        System.out.println("Firstname: " + nameParts[0] ); // wywołujemy Firstname podając w nawiasie jego indeks
        System.out.println("Lastname: " + nameParts[1] ); // analogicznie
    }
}
