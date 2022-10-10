// klasa Shop, która będzie przechowywać kolekcję unikalnych zamówień

// Nowo utworzona klasa powinna mieć następujące funkcjonalności:
// dodanie nowego zamówienia,
// zwrócenie liczby zamówień,
// zsumowanie wartości wszystkich zamówień.
// zwrócenie listy zamówień z zakresu dwóch dat,
// pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia),



package com.kodilla.execution_model.homework;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    public static List<Order> orders = new ArrayList<>();
    public void add (Order order){
        orders.add(order);
    }

   // public void addOrder(Order order) { // dodanie nowego zamówienia
     //   this.addOrder(order);
    // }

    public int getSize() { // zwrócenie liczby zamówień
        return this.orders.size();
    }

    public double getSumOfAllValues() { // zsumowanie wartości wszystkich zamówień
        return orders.stream()
                .map(value -> value.getOrderValue())
                .mapToDouble(value -> value)
                .sum();
    }

    public List<Order> getOrdersFromDatesRange (LocalDate firstDate, LocalDate lastDate){ // //zwrócenie listy zamówień z zakresu dwóch dat,
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

    public void clearOrderList () { // usunięcie wszystkich zamówień
        orders.clear();
    }
}
