package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();

    Order order1 = new Order(99.99, LocalDate.of(2022, 10, 7), "akowalska");
    Order order2 = new Order(199.99, LocalDate.of(2022, 10, 1), "mchybiak");
    Order order3 = new Order(9.99, LocalDate.of(2022, 5, 30), "knowak");
    Order order4 = new Order(12.33, LocalDate.of(2021, 1, 12), "akowalska");
    Order order5 = new Order(0.01, LocalDate.of(2025, 3, 1), "zosia13");
    Order order6 = new Order(0.99, LocalDate.of(1885, 8, 10), "abc123");

    @BeforeEach
    void initializeOrder() {
        shop.add(order1);
        shop.add(order2);
        shop.add(order3);
        shop.add(order4);
        shop.add(order5);
        shop.add(order6);
    }


    @Test //1. Dodanie nowego zamówienia.
    void shouldAddOrder() {
        int numberOfOrders = shop.getSize();
        assertEquals(6, numberOfOrders);
    }

    @Test //2. Sprawdzenie czy rozmiar zmienia się po dodaniu zamówienia.
    void afterAddOrderSizeOfListShouldBeChanged() {
        assertEquals(6, shop.getSize());
    }

    @Test //3. Sprawdzenie czy zmienia się wartość wszystkich zamówień po dodaniu nowego zamówienia.
    void afterAddOrderSumOfValueShouldBeChanged(){
        assertEquals(323.3, shop.getSumOfAllValues());
    }

    @Test //4. Sprawdzenie czy rozmiar listy pozostaje bez zmian po dodaniu dubla.
    void sizeOfListShouldNotBeChangedAfterAddDuplicateOrder(){
        shop.add(order1);
        assertEquals(6, shop.getSize());
    }

    @Test //5. Sprawdzenie czy suma wartości wszystkich zamówień nie zmienia się po dodaniu dubla.
    void sumOfValueShouldNotBeChangedAfterAddDuplicateOrder(){
        shop.add(order1);
        assertEquals(323.3, shop.getSumOfAllValues());

    }

    @Test // 6. Sprawdzenie czy zwróci pustą listę po podaniu zakresu dat w których nie ma zamówień.
    void shouldReturnEmptyListForDatesOutOfRange(){
        assertEquals(new ArrayList<Order>(), shop.getOrdersFromDatesRange(LocalDate.of(2022,10,30), LocalDate.of(2022,12,31)));
    }

    @Test // 7. Sprawdzenie czy zwróci 4 elementy po podaniu odpowiedniego zakresu.
    void shouldReturn4ElementsForRange(){ // do poprawy
        List<Order> expectedOrders = new ArrayList<>();
        expectedOrders.add(order1);
        expectedOrders.add(order2);
        expectedOrders.add(order3);
        expectedOrders.add(order4);
        assertEquals(expectedOrders, shop.getOrdersFromDatesRange(LocalDate.of(2021,1,1), LocalDate.of(2022,12,31)));
    }

    @Test // 8. Sprawdzenie czy zwróci 4 zamówienia po podaniu odpowiedniego zakresu
    public void shouldReturnEmptyListForValuesOutOfRange(){ // do poprawy
        List<Order> expectedOrdersWithValueFromRange = new ArrayList<>();
        expectedOrdersWithValueFromRange.add(order1);
        expectedOrdersWithValueFromRange.add(order2);
        expectedOrdersWithValueFromRange.add(order3);
        expectedOrdersWithValueFromRange.add(order4);
        assertEquals(expectedOrdersWithValueFromRange, shop.getOrdersByOrderValue(8.0, 200.0));
    }
}
