package com.kodilla.spring.basic.spring_configuration.homework;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTestSuite {

    CarFactory timeSeason = new CarFactory();
    private Date date = new Date();
    public Date getDate(){
        return date;
    }

    @Test
    void getCarAutumnAtDay(){
        Date date1 = getDate();
        Car car = timeSeason.getCar();
        assertEquals("Sedan", car.getCarType());
        assertFalse(car.hasHeadlightsTurnedOn());
    }
}