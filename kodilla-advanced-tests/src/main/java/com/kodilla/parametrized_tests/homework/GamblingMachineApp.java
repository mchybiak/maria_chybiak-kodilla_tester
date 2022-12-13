package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Set;

public class GamblingMachineApp {

    public static void main(String[] args) {
        Set<Integer> myNumbers = new HashSet<>();

        myNumbers.add(5);
        myNumbers.add(9);
        myNumbers.add(25);
        myNumbers.add(32);
        myNumbers.add(41);
        myNumbers.add(44);

        System.out.println(myNumbers);

        GamblingMachine2 gamblingMachine = new GamblingMachine2();
        try {
            gamblingMachine.howManyWins(myNumbers);
        } catch (InvalidNumbersException e) {
            e.printStackTrace();
        }
    }
}
