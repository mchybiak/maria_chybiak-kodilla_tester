package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite2 {
GamblingMachine gamblingMachine = new GamblingMachine();

@ParameterizedTest
@CsvFileSource(resources = "/gamblingMachineCorrectNumbers.csv", numLinesToSkip = 1)

public void howManyWins_ReturnNumberOfWins (int n1, int n2, int n3, int n4, int n5, int n6) throws InvalidNumbersException{
      Set<Integer> numbers = new HashSet<>();
      numbers.add(n1);
      numbers.add(n2);
      numbers.add(n3);
      numbers.add(n4);
      numbers.add(n5);
      numbers.add(n6);

       assertEquals(true,GamblingMachine.howManyWins(numbers) >= 0 && GamblingMachine.howManyWins(numbers) <=6);
   }


    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineNegativeNumbersAndNull.csv", numLinesToSkip = 1)
    public void howManyWins_NegativeNumbersAndNull (int n1, int n2, int n3, int n4, int n5, int n6) throws InvalidNumbersException{
        Set<Integer> numbers = new HashSet<>();
        numbers.add(n1);
        numbers.add(n2);
        numbers.add(n3);
        numbers.add(n4);
        numbers.add(n5);
        numbers.add(n6);

        assertEquals(InvalidNumbersException.class,GamblingMachine.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineTooManyNumbers.csv", numLinesToSkip = 1)
    public void testHowManyWins_TooManyNumbers(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(n1);
        numbers.add(n2);
        numbers.add(n3);
        numbers.add(n4);
        numbers.add(n5);
        numbers.add(n6);
        numbers.add(n7);
        numbers.add(n8);
        numbers.add(n9);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineTooHighNumbers.csv", numLinesToSkip = 1)
    public void testHowManyWins_TooHighNumbers_withException(int n1, int n2, int n3, int n4, int n5, int n6) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(n1);
        numbers.add(n2);
        numbers.add(n3);
        numbers.add(n4);
        numbers.add(n5);
        numbers.add(n6);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }
}




// gamblingMachineCorrectNumbers.csv
// gamblingMachineNegativeNumbersAndNull.csv
// gamblingMachineTooManyNumbers.csv
// gamblingMachineTooHighNumbers.csv