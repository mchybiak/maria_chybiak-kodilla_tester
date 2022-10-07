//1. Dodanie nowego zamówienia i sprawdzenie czy zmienia się rozmiar listy,
//2. Zwrócenie listy zamówień z zakresu dwóch podanych dat; podanie zakresu dat w których nie ma żadnych zamówień; podanie ‚nierealnych’ dat np. 2025 rok,
//3. Zwrócenie listy zamówień na podstawie zakresu wartości zamówień; podanie zakresu wartości spoza listy - wartość ujemna, wartość o dużym indeksie,
//4. Usunięcie kilu / wszystkich zamówień i sprawdzenie czy zmienia się rozmiar listy,
//5. Dodanie zamówienia i sprawdzenie czy zmienia się wartość wszystkich zamówień,
//6. Usunięcie zamówienia i sprawdzenie czy zmienia się wartość wszystkich zamówień.



package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;

import java.time.Instant;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    LocalDate date1 = LocalDate.of(2022, 10, 7);
    LocalDate date2 = LocalDate.of(2022,9,23);
    LocalDate date3 = LocalDate.of(2022,9,21);
    LocalDate date4 = LocalDate.of(2021,5,13);
    LocalDate date5 = LocalDate.of(2025,10,21);
    LocalDate date6 = LocalDate.of(1877,3,31);

    Order order1 = new Order(99.99, date1, "mchybiak");
    Order order2 = new Order(22.35, date2, "akowalska");
    Order order3 = new Order(125.14, date3, "knowak");
    Order order4 = new Order(100.0, date4, "abc123");
    Order order5 = new Order(0.99, date2, "zosia12");
    Order order6 = new Order(299.99, date3, "123abc");

    @BeforeEach
    public void addOrder(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
    }

}