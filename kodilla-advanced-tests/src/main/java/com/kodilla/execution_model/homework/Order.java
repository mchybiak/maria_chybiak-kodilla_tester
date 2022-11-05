// klasę Order, która będzie przechowywać dane zamówienia:
// wartość zamówienia, datę oraz login osoby dokonującej zamówienia

package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {

    private double orderValue;
    private LocalDate dateOfOrder;
    private String login;

    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", dateOfOrder=" + dateOfOrder +
                ", login='" + login + '\'' +
                '}';
    }


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Double.compare(order.getOrderValue(), getOrderValue()) == 0 && Objects.equals(getDateOfOrder(), order.getDateOfOrder()) && Objects.equals(getLogin(), order.getLogin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderValue(), getDateOfOrder(), getLogin());
    }
}
