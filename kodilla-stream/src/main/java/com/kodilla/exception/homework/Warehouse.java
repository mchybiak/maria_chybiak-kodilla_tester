// Klasę Warehouse, która będzie przechowywała kolekcję zamówień.
// Napisz metody addOrder(Order order) – dodającą zamówienie do kolekcji oraz metodę Order getOrder(String number),
// która wyszuka w kolekcji zamówienie o podanym numerze (użyj Stream) i je zwróci.
// W przypadku braku zamówienia w kolekcji rzuć wyjątkiem stworzonym w kroku pierwszym.

package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    public static List<Order> orders = new ArrayList<>();

    public void addOrder (Order order){
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException{
        orders.stream().filter(order -> order.getNumber().equals(number))
                .forEach(n -> System.out.println("Your order is " + number));
        for (Order order : orders){
            if (order.getNumber().equals(number)){
                return order;
            }
        }
        throw new OrderDoesntExistException();
    }
}
