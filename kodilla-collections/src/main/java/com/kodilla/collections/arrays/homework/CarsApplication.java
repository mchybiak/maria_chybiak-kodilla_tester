// Klasę CarsApplication z metodą public static Car drawCar(),
// która będzie tworzyła losowy samochód z losowo zwiększoną prędkością.
//
//Metodę main, w której znajdzie się tablica o losowym rozmiarze od 1 do 15 samochodów.
// Do każdego elementu tablicy wpisz wylosowany przy pomocy metody drawCar samochód,
// a następnie przy pomocy pętli wyświetl informacje o wszystkich samochodach znajdujących się w tablicy.


package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.Random;

public class CarsApplication {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];  //Tworzę tablicę z losową ilością elementów (0-15)

        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar(){  // Losowanie wyświetlanych samochodów
        int createdRandomCar = RANDOM.nextInt(3);
        double randomSpeedUp = getRandomSpeedUp();
        if (createdRandomCar == 0)
            return new Audi(randomSpeedUp);
        if (createdRandomCar == 1)
            return new Toyota(randomSpeedUp);
        if (createdRandomCar == 2)
            return new Volvo(randomSpeedUp);
    }

        private static double getRandomSpeedUp(){
        return Random.nextInt(50);
    }
}



