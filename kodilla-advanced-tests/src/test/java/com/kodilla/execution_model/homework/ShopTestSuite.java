package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    private static Shop shop = new Shop();

    private static Order a = new Order(5, LocalDate.of(2022, 11, 29), "login1");
    private static Order b = new Order(10, LocalDate.of(2022, 11, 25), "login2");
    private static Order c = new Order(15, LocalDate.of(2022, 8, 20), "login1");
    private static Order d = new Order(20, LocalDate.of(2020, 8, 1), "login3");
    private static Order e = new Order(25, LocalDate.of(2019, 12, 3), "login1");
    private static Order f = new Order(30, LocalDate.of(2010, 1, 10), "login4");

    @Test
    public void shouldAddOrderToShop() {
        //when
        int numberOfItems = shop.getSize();
        //then
        assertEquals(6, numberOfItems);
    }

    @Test
    public void shouldShowOrdersInADateRange() {
        //given
        List<Order> expectedList = new ArrayList<>();
        expectedList.add(a);
        expectedList.add(b);
        expectedList.add(c);
        LocalDate startDate = LocalDate.of(2022,1,1);
        LocalDate lastDate = LocalDate.of(2022,12,31);
        //when
        List<Order> ordersFromTwoYears = shop.getOrdersInADateRange(startDate, lastDate);
        //then
        assertEquals(expectedList, ordersFromTwoYears);
    }

    @Test
    public void shouldShowOrderWithTheHighestPrice() {
        //when
        int maxNumber = shop.getOrderWithHighestPrice();
        //then
        assertEquals(30, maxNumber);
    }

    @Test
    public void shouldShowOrderWithTheLowestPrice() {
        //when
        int minNumber = shop.getOrderWithTheLowestPrice();
        //then
        assertEquals(5, minNumber);
    }

    @Test
    public void shouldCountNumberOfOrders() {
        //when
        int numberOfItems = shop.getSize();
        //then
        assertEquals(6, numberOfItems);
    }

    @Test
    public void shouldSumAllOrderPrices() {
        //when
        int sumOfPrices = shop.sumAllOrderPrices();
        //then
        assertEquals(105, sumOfPrices);
    }

    @BeforeAll
    public static void initializeOrders() {
        shop.addOrder(a);
        shop.addOrder(b);
        shop.addOrder(c);
        shop.addOrder(d);
        shop.addOrder(e);
        shop.addOrder(f);
    }
}