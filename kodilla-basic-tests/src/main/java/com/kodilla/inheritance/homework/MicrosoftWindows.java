package com.kodilla.inheritance.homework;

public class MicrosoftWindows extends OperatingSystem{
    public MicrosoftWindows(int yearOfReleaseOfOperatingSystem) {
        super(yearOfReleaseOfOperatingSystem);
    }

    public void turnOn(){System.out.println("System is turned on");}

    public void turnOff(){System.out.println("System is turned off");}
}
