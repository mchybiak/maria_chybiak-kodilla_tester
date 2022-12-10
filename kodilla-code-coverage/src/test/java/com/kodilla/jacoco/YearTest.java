package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearTest {
    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4() {
        Year year = new Year(2020);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldNotBeLeapYearIfDivisibleBy100() {
        Year year = new Year(1900);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }

    @Test
    public void shouldNotBeLeapYearIfDivisibleBy4And100() {
        Year year = new Year(2001);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }

    @Test
    public void shouldNotBeLeapYearIfDivisibleByOtherNumber() {
        Year year = new Year(1999);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }
}