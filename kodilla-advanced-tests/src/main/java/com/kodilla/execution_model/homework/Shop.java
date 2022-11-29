// klasa Shop, która będzie przechowywać kolekcję unikalnych zamówień

// Nowo utworzona klasa powinna mieć następujące funkcjonalności:
// dodanie nowego zamówienia,
// zwrócenie liczby zamówień,
// zsumowanie wartości wszystkich zamówień.
// zwrócenie listy zamówień z zakresu dwóch dat,
// pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia),

package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    public static List<Order> myOrders = new ArrayList<>();

    public static List<Order> getMyList() {
        return myOrders;
    }

    public void addOrder(Order order) {
        this.myOrders.add(order);
    }

    public List<Order> getOrdersInADateRange (LocalDate startDate, LocalDate lastDate) {

        List<Order> newList = Shop.getMyList()
                .stream()
                .filter(u -> u.getDate().isAfter(startDate))
                .filter(u -> u.getDate().isBefore(lastDate))
                .collect(Collectors.toList());

        return newList;
    }

    public int getSize() {
        return this.myOrders.size();
    }

    public int getOrderWithHighestPrice() {

        int max = Shop.getMyList()
                .stream()
                .map(u -> u.getPrice())
                .mapToInt(n -> n)
                .max()
                .getAsInt();

        return max;
    }
    public int getOrderWithTheLowestPrice() {

        int min = Shop.getMyList()
                .stream()
                .map(u -> u.getPrice())
                .mapToInt(n -> n)
                .min()
                .getAsInt();

        return min;
    }
    public int sumAllOrderPrices() {

        int sum = Shop.getMyList()
                .stream()
                .map(u -> u.getPrice())
                .mapToInt(n -> n)
                .sum();

        return sum;

    }
}