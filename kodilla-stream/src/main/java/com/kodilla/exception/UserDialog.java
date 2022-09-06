package com.kodilla.exception;

import java.util.Scanner;

public class UserDialog {
    public static int getNumberOfRounds() { // Pytanie użytkownika o liczbę rund
        Scanner scanner = new Scanner(System.in); // Klasa służąca do odczytywania wprowadzonych danych
        while (true) {
            System.out.println("Enter number of rounds: ");
            String s = scanner.nextLine();
            try {
                int rounds = Integer.parseInt(s);
                return rounds;
            } catch (Exception e) {
                System.out.println("Wrong data. Enter only digits.");
            }
        }
    }
}
