package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GamblingMachineTestSuite2 {

    private GamblingMachine2 gamblingMachine = new GamblingMachine2();

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersGamblingMachine.csv", numLinesToSkip = 1)
    public void shouldCountWins(String input) throws InvalidNumbersException {

        String[] numbers = input.split(";");
        List<String> numberList = Arrays.asList(numbers);
        Set<Integer> collect = numberList.stream().map(numberItem -> Integer.parseInt(numberItem)).collect(Collectors.toSet());
        int wins = gamblingMachine.howManyWins(collect);
        int result = wins;
        assertTrue(result >= 0 && result <=6);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/numbersGamblingMachine2.csv", numLinesToSkip = 1)
    public void shouldCountWins_withException(String input) {

        String[] numbers = input.split(";");
        List<String> numberList = Arrays.asList(numbers);
        Set<Integer> collect = numberList.stream().map(numberItem -> Integer.parseInt(numberItem)).collect(Collectors.toSet());
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(collect));

    }
    @Test
    public void test() {
        String input = "1;2;3;4";
        String[] strings = input.split(";");
        List<String> list = Arrays.asList(strings);
        Set<Integer> collect = list.stream().map(listItem -> Integer.parseInt(listItem))
                .collect(Collectors.toSet());
    }
}