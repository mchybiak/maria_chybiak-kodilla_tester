

package com.kodilla.collections.interfaces.homework;

public class Volvo implements Car {

    private double speed;

    public Volvo (double speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return (int) speed;
    }

    public void increaseSpeed(){
        speed = speed + 11;
    }

    public void decreaseSpeed(){
        speed =  speed - 15;
    }

    @Override
    public String toString() {
        return "Volvo{" +
                "speed=" + speed +
                '}';
    }
}
