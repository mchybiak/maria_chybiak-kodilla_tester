package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int yearOfReleaseOfOperatingSystem;

    public OperatingSystem (int yearOfReleaseOfOperatingSystem){
        this.yearOfReleaseOfOperatingSystem = yearOfReleaseOfOperatingSystem;
    }

    public void turnOn() {
        System.out.println("Operating system is turn on");
    }

    public void turnOff() {
        System.out.println("Operating system is turn off");
    }

    public int getYearOfReleaseOfOperatingSystem() {
        return getYearOfReleaseOfOperatingSystem();
    }

    public void displayYearOfReleaseOfOperatingSystem() {
        System.out.println("Year of release of operating system: " + yearOfReleaseOfOperatingSystem);
    }
}
