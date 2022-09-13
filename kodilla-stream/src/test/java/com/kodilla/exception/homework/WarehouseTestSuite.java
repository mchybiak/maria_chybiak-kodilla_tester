package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetOrder() throws OrderDoesntExistException{
        List<Order> orders = new ArrayList<>();
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order1"));
        warehouse.addOrder(new Order("Order2"));
        warehouse.addOrder(new Order("Order4"));
        warehouse.addOrder(new Order("Order5"));
        warehouse.addOrder(new Order("Order7"));
        warehouse.addOrder(new Order("Order67"));
        warehouse.addOrder(new Order("Order101"));

        Order order = warehouse.getOrder("Order2");

        Order expectedOrder = new Order("Order2");
        assertEquals(expectedOrder, order);
        assertEquals(new Order("Order2"), order);
    }

    @Test
    public void testIncorrectOrder(){

        List<Order> orders = new ArrayList<>();
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order1"));
        warehouse.addOrder(new Order("Order2"));
        warehouse.addOrder(new Order("Order4"));
        warehouse.addOrder(new Order("Order5"));
        warehouse.addOrder(new Order("Order7"));
        warehouse.addOrder(new Order("Order67"));
        warehouse.addOrder(new Order("Order101"));

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("Order20"));

        // Metoda assertThrows przyjmuje oczekiwany typ wyjątku jako pierwszy argument,
        // dalej jest lambda – przekazuje kod, jaki ma zostać uruchomiony.

    }
}


// @Test
//    public void testIsAirportInUse() throws AirportNotFoundException {
//        // given
//        AirportRepository airportRepository = new AirportRepository();
//        // when
//        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
//        // then
//        assertTrue(isWarsawInUse);
//    }
//
//    @Test
//    public void testIsAirportInUse_withException() {
//        // given
//        AirportRepository airportRepository = new AirportRepository();
//        // when
//        // then
//        assertThrows(AirportNotFoundException.class, () -> airportRepository.isAirportInUse("Vienna"));