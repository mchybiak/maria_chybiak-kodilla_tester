package com.kodilla.spring.basic.spring_configuration.homework;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTestSuite {

    CarFactory timeSeason = new CarFactory();

    @Test
    void getCarWinterAtDay(){
        LocalDateTime now = LocalDateTime.of(2022,1,5,10,00);
        Car car = timeSeason.getCar();
        assertEquals("SUV", car.getCarType());
        assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    void getCarWinterAtNight(){
        LocalDateTime now = LocalDateTime.of(2022,1,5,20,00);
        Car car = timeSeason.getCar();
        assertEquals("SUV", car.getCarType());
        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    void getCarSummerAtDay(){
        LocalDateTime now = LocalDateTime.of(2022,1,5,10,00);
        Car car = timeSeason.getCar();
        assertEquals("Cabrio", car.getCarType());
        assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    void getCarSummerAtNight(){
        LocalDateTime now = LocalDateTime.of(2022,1,5,22,00);
        Car car = timeSeason.getCar();
        assertEquals("Cabrio", car.getCarType());
        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    void getCarSpringAndAutumnAtDay(){
        LocalDateTime now = LocalDateTime.of(2022,9,5,11,00);
        Car car = timeSeason.getCar();
        assertEquals("Sedan", car.getCarType());
        assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    void getCarSpringAndAutumnAtNight(){
        LocalDateTime now = LocalDateTime.of(2022,9,5,22,00);
        Car car = timeSeason.getCar();
        assertEquals("Sedan", car.getCarType());
        assertFalse(car.hasHeadlightsTurnedOn());
    }
}