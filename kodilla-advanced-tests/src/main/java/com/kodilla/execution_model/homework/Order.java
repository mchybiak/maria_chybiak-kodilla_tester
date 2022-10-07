// klasę Order, która będzie przechowywać dane zamówienia:
// wartość zamówienia, datę oraz login osoby dokonującej zamówienia


package com.kodilla.execution_model.homework;

import java.time.Instant;
import java.util.Date;

public class Order {

    private double orderValue;
    private Instant dateOfOrder;
    private String login;

    public Order(double orderValue, Instant dateOfOrder, String login) {
        this.orderValue = orderValue;
        this.dateOfOrder = dateOfOrder;
        this.login = login;
    }


    public double getOrderValue() {
        return orderValue;
    }

    public Instant getDateOfOrder() {
        return dateOfOrder;
    }

    public String getLogin() {
        return login;
    }
}
