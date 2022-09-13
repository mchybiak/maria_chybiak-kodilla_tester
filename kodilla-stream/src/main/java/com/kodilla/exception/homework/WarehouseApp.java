// Klasę WarehouseApp z metodą main. W metodzie main dodaj kilka zamówień do hurtowni przy pomocy metody addOrder(),
// a następnie spróbuj wyszukać jakieś nieistniejące zamówienie. Przygotuj odpowiednią obsługę błędów.


package com.kodilla.exception.homework;

public class WarehouseApp {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order1"));
        warehouse.addOrder(new Order("Order2"));
        warehouse.addOrder(new Order("Order4"));
        warehouse.addOrder(new Order("Order5"));
        warehouse.addOrder(new Order("Order7"));
        warehouse.addOrder(new Order("Order67"));
        warehouse.addOrder(new Order("Order101"));

        try {
            Order isOrderExist = warehouse.getOrder("Order75"); // instrukcja powodująca rzucenie wyjątku
            System.out.println("Order: " + isOrderExist);

        } catch (
                OrderDoesntExistException e) { // klasa wyjątku, na którą kod powinien reagować
            System.out.println("Sorry, this order doesn't exist in out system.");

        } finally { // linia 30 wykona się bez względu na to czy wyjątek wystąpi
            System.out.println("Thank you for using our system");
        }
    }
}
