package com.kodilla.inheritance.homework;

public class OperatingSystemApplication {

    public static void main(String[] args) {

        MicrosoftWindows microsoftWindows = new MicrosoftWindows(1985);
        microsoftWindows.turnOn();

        AppleIOS appleIOS = new AppleIOS(1999);
        appleIOS.displayYearOfReleaseOfOperatingSystem();

    }
}
