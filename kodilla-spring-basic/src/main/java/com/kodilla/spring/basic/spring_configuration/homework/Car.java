package com.kodilla.spring.basic.spring_configuration.homework;

// Wewnątrz pakietu utwórz interfejs Car, zawierający metodę zwracającą boolean o nazwie hasHeadlightsTurnedOn.
// Metoda powinna zwracać true lub false w zależności od tego, czy pojazd ma włączone światła.
// Dodaj drugą metodę, getCarType(), zwracającą Stringa – typ samochodu.

public interface Car {
    String getCarType();
    boolean hasHeadlightsTurnedOn();
}
