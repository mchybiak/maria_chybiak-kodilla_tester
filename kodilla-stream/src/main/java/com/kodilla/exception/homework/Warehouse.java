// Klasę Warehouse, która będzie przechowywała kolekcję zamówień.
// Napisz metody addOrder(Order order) – dodającą zamówienie do kolekcji oraz metodę Order getOrder(String number),
// która wyszuka w kolekcji zamówienie o podanym numerze (użyj Stream) i je zwróci.
// W przypadku braku zamówienia w kolekcji rzuć wyjątkiem stworzonym w kroku pierwszym.



package com.kodilla.exception.homework;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private Map<String, Integer> addOrder(){
        Map<String, Integer> orders = new HashMap<>();
        orders.put("Order 1", 1);
        orders.put("Order 2", 2);
        orders.put("Order 3", 3);
        orders.put("Order 4", 4);
        orders.put("Order 5", 5);
        orders.put("Order 6", 6);
        orders.put("Order 7", 7);
        orders.put("Order 8", 8);
        orders.put("Order 9", 9);

        return orders;
    }
}
