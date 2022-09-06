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
        orders.put("Zamówienie 1", 1);
        orders.put("Zamówienie 2", 2);
        orders.put("Zamówienie 3", 3);
        orders.put("Zamówienie 4", 4);
        orders.put("Zamówienie 5", 5);
        orders.put("Zamówienie 6", 6);
        orders.put("Zamówienie 7", 7);
        orders.put("Zamówienie 8", 8);
        orders.put("Zamówienie 9", 9);

        return orders;
    }
}
