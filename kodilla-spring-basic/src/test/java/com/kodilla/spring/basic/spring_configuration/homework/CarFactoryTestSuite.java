package com.kodilla.spring.basic.spring_configuration.homework;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTestSuite {

    CarFactory timeSeason = new CarFactory();
    private Instant instant = Instant.now();
    public Instant getInstant(){
        return instant;
    }

    @Test
    void getCarAutumnAtDay(){
        Instant instant1 = getInstant();
        Car car = timeSeason.getCar();
        assertEquals("Sedan", car.getCarType());
        assertFalse(car.hasHeadlightsTurnedOn());
    }
}