package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource()

    public void throwExceptionIfNumberIsNotCorrect(String numbers){ //wyjątek gdy liczba jest nieprawidłowa
        String[] n = numbers.split(" ");

        Set<String> numbersInSet = new HashSet<>();
        for (String number: n){
            numbersInSet.add(number);
        }

        Set<Integer> testValues = new HashSet<>();
        numbersInSet.stream()
                .mapToInt(a -> Integer.parseInt(a))
                .forEach(b -> testValues.add(b));
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(testValues));
    }

    @ParameterizedTest
    @CsvFileSource()

    public void  noExceptionIfNumberIsCorrect(String numbers) {
        String[] n = numbers.split(" ");

        Set<String> numbersInSet = new HashSet<>();
        for (String number : n) {
            numbersInSet.add(number);
        }

        Set<Integer> testValues = new HashSet<>();
        numbersInSet.stream()
                .mapToInt(a -> Integer.parseInt(a))
                .forEach(b -> testValues.add(b));
        noExceptionIfNumberIsCorrect(() -> gamblingMachine.howManyWins(testValues));
    }
}
