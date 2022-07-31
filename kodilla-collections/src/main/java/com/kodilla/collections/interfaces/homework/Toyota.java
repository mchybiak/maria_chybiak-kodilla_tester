//Trzy różne klasy samochodów, implementujące interfejs Car w różny sposób –
// różnica będzie polegała na tym, o jaką wartość zwiększy / zmniejszy się wartość
// prędkości pojazdu po wywołaniu metod increaseSpeed() / decreaseSpeed().
// Prędkość może wzrastać o inną wartość w metodzie increaseSpeed(),
// niż się zmniejszać w metodzie decreaseSpeed(), ponieważ auta mogą mieć różne silniki,
// ale bardzo podobne hamulce.

package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car{

    private double speed;

    public Toyota (double speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return (int) speed;
    }

    public void increaseSpeed(){
        speed =  speed + 11;
    }

    public void decreaseSpeed(){
        speed =  speed - 19;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "speed=" + speed +
                '}';
    }
}
