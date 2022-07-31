//Trzy różne klasy samochodów, implementujące interfejs Car w różny sposób –
// różnica będzie polegała na tym, o jaką wartość zwiększy / zmniejszy się wartość
// prędkości pojazdu po wywołaniu metod increaseSpeed() / decreaseSpeed().
// Prędkość może wzrastać o inną wartość w metodzie increaseSpeed(),
// niż się zmniejszać w metodzie decreaseSpeed(), ponieważ auta mogą mieć różne silniki,
// ale bardzo podobne hamulce.

package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {

    private double speed;

    public Audi (double speed){  // tworzę konstruktor
        this.speed = speed;
    }

    @Override
    public int getSpeed() {  // metoda getSpeed implementowana z interfejsu Car
        return (int) speed;
    }

    public void increaseSpeed(){  // metoda increaseSpeed implementowana z interfejsu Car
        speed =  speed + 20;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "speed=" + speed +
                '}';
    }

    public void decreaseSpeed(){  // metoda decreaseSpeed implementowana z interfejsu Car
        speed =  speed - 21;



    }



}
