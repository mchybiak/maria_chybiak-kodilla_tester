// klasa Shop, która będzie przechowywać kolekcję unikalnych zamówień

// Nowo utworzona klasa powinna mieć następujące funkcjonalności:
// dodanie nowego zamówienia,
// zwrócenie liczby zamówień,
// zsumowanie wartości wszystkich zamówień.
// zwrócenie listy zamówień z zakresu dwóch dat,
// pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia),



package com.kodilla.execution_model.homework;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) { // dodanie nowego zamówienia
        this.addOrder(order);
    }

    public int getSize() { // zwrócenie liczby zamówień
        return this.orders.size();
    }

    public double getSumOfAllValues() { // zsumowanie wartości wszystkich zamówień
        return orders.stream()
                .map(value -> value.getOrderValue())
                .mapToDouble(value -> value)
                .sum();
    }

    public List<Order> getOrdersFromDatesRange (Instant firstDate, Instant lastDate){ // //zwrócenie listy zamówień z zakresu dwóch dat,
        return orders.stream()
                .filter(date -> date.getDateOfOrder().isAfter(firstDate))
                .filter(date -> date.getDateOfOrder().isBefore(lastDate))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersByOrderValue (double theLowestValue, double theHighestValue){ // pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia)
        return orders.stream()
                .filter(value -> value.getOrderValue() >= theLowestValue)
                .filter(value -> value.getOrderValue() <= theHighestValue)
                .collect(Collectors.toList());
    }

    public void clear() { // usunięcie wszystkich zamówień
        this.orders.clear();
    }
}
