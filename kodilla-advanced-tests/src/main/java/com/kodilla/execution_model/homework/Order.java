// klasę Order, która będzie przechowywać dane zamówienia:
// wartość zamówienia, datę oraz login osoby dokonującej zamówienia


package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {

    private double orderValue;
    private LocalDate dateOfOrder;
    private String login;

    public Order(double orderValue, LocalDate dateOfOrder, String login) {
        this.orderValue = orderValue;
        this.dateOfOrder = dateOfOrder;
        this.login = login;
    }


    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public String getLogin() {
        return login;
    }
}
