// Metody te będą wyszukiwały loty do oraz z podanego miasta.

package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)) {
                result.add(flight);
            }
        }
        return result;
    }


    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival)) {
                result.add(flight);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        List<Flight> FlightsFromWarsaw = flightFinder.findFlightsFrom("Warsaw");
        System.out.println(FlightsFromWarsaw);

        List<Flight> FlightsToHamburg = flightFinder.findFlightsTo("London");
        System.out.println(FlightsToHamburg);
    }
}

