//Usuń jeden z samochodów z kolekcji, używając do tego metody remove(int index).
//Usuń jeden z samochodów z kolekcji, używając do tego metody remove(Object o).
//Ponownie wyświetl zawartość kolekcji, a także informację o jej rozmiarze.




package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>(); // zmienna cars typu List<Car> i przypisanie pustej
                                            // kolekcji w postaci obiektu klasy ArrayList
        Volvo volvo = new Volvo(120);
        cars.add(volvo);
        cars.add(new Audi(100));
        cars.add(new Toyota(110));

        cars.remove(2);  // usuwam trzeci element (int index)
        cars.remove(volvo);   // usuwam pierwszy element (Object o)

        for(Car car: cars){
            System.out.println(car);
            System.out.println(cars.size());
        }

    }
}
