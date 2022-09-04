// Klasę FlightRepository z metodą statyczną getFlightsTable(),
// która zwraca listę lotów obsługiwanych przez dane lotnisko
// (wypełnij tę listę przykładowymi lotami).


package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable(){
        List<Flight> flightsList = new ArrayList<>();

        flightsList.add(new Flight("Cracow", "London"));
        flightsList.add(new Flight("Cracow", "Milan"));
        flightsList.add(new Flight("Warsaw", "Hamburg"));
        flightsList.add(new Flight("Warsaw", "Los Angeles"));
        flightsList.add(new Flight("London", "Warsaw"));
        flightsList.add(new Flight("New York", "Cracow"));
        flightsList.add(new Flight("Milan", "London"));

        return flightsList;

    }
}
