package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class TestsData {

 static Stream<Arguments> provideTestsDataForBMICalculator() {
       return Stream.of(
               Arguments.of(1.60, 60 ,"Normal (healthy weight)"), // BMI 18.75
               Arguments.of(1.70, 70,"Normal (healthy weight)"), // BMI 20.58
               Arguments.of(1.80, 80, "Normal (healthy weight)"), // BMI 22.22
               Arguments.of(1.90, 90, "Normal (healthy weight)"), // BMI 23.68
               Arguments.of(1.60, 180, "Obese Class VI (Hyper Obese)"), // BMI 50
               Arguments.of(1.70, 35, "Very severely underweight") // BMI 13.23

     );
    }
}
