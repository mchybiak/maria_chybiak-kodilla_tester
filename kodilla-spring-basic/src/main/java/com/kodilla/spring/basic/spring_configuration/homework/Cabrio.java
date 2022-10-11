package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car{

    @Override
    public String getCarType() {
        return "Cabrio";
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.of(6,00)) && time.isBefore(LocalTime.of(22,00))) {
            return false;
        } else {
            return true;
        }
    }


}