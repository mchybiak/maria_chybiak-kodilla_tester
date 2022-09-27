package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


class GamblingMachine {

    public static int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException { //ilość wygranych -> wyjątek
        validateNumbers(userNumbers);
        Set<Integer> computerNumbers = generateComputerNumbers();
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    private static void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (isNotCorrectSize(numbers) || isAnyNumberOutOfDeclaredScope(numbers)) {
            throw new InvalidNumbersException();
        }
    }

    private static boolean isAnyNumberOutOfDeclaredScope(Set<Integer> numbers) { //liczba spoza zakresu 1-49
        return numbers.stream()
                .anyMatch(number -> number < 1 || number > 49);
    }

    private static boolean isNotCorrectSize(Set<Integer> numbers) {
        return numbers.size() != 6;
    }

    private static Set<Integer> generateComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while(numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;


    }



}
