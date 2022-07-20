package com.kodilla.inheritance.homework;

public class AppleIOS extends OperatingSystem{
    public AppleIOS(int yearOfReleaseOfOperatingSystem) {
        super(yearOfReleaseOfOperatingSystem);
    }

    public void turnOn(){System.out.println("System is turned on");}

    public void turnOff(){System.out.println("System is turned off");}
}
