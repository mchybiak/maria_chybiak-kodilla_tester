// Wykorzystując metodę z osobną klasą przygotowującą dane testowe, napisz testy dla metody obliczającej BMI.


package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.TestsData#provideTestsDataForBMICalculator")
    public void shouldCalculateBMI (double heightInMeters, double weightInKilogram, String text) {
        Person person = new Person(heightInMeters, weightInKilogram);
        assertEquals(text, person.getBMI());
    }

}