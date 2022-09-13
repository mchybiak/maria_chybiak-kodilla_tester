// Klasę Order, posiadającą pole String number, oraz konstruktor i gettery.

package com.kodilla.exception.homework;

import java.util.Objects;

public class Order {
    public String getNumber;
    private String number;

    public Order(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Objects.equals(getNumber(), order.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }

    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                '}';
    }
}
