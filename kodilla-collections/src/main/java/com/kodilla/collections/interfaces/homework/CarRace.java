package com.kodilla.collections.interfaces.homework;

public class CarRace {

    private static void doRace(Car car){  // 3krotne wywołnie metody increaseSpeed + 2krotne decreaseSpeed
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());

    }

    public static void main(String[] args) { // metoda main, w której utworzone są obiekty samochodów
        Volvo volvo = new Volvo(100);
        System.out.println("Volvo speed is: "); doRace(volvo);

        Toyota toyota = new Toyota(120);
        System.out.println("Toyota speed is: "); doRace(toyota);

        Audi audi = new Audi(140);
        System.out.println("Audi speed is: "); doRace(audi);

    }

}
