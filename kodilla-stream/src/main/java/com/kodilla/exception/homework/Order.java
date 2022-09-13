// Klasę Order, posiadającą pole String number, oraz konstruktor i gettery.

package com.kodilla.exception.homework;

import java.util.Objects;

public class Order {

    private String number;

    public Order(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
