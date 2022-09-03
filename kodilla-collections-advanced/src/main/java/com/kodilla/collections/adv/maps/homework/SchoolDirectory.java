package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> principalOfSchool = new HashMap<>();
        Principal adam = new Principal("Adam Nowak");
        Principal jan = new Principal("Jan Kowalski");
        Principal anna = new Principal("Anna Polak");

        School elementarySchool = new School ( (Arrays.asList(23,25,24,19,26)), ("Elementary School"));
        School highSchool = new School ( (Arrays.asList(28,30,32,20)), ("High School"));
        School middleSchool = new School ( (Arrays.asList(19,21,23,23,21)), ("Middle School"));

        principalOfSchool.put(adam, elementarySchool);
        principalOfSchool.put(jan, highSchool);
        principalOfSchool.put(anna, middleSchool);

        for (Map.Entry<Principal, School> principalEntry: principalOfSchool.entrySet()) {
            System.out.println(principalEntry.getKey() + " is principal of " + principalEntry.getValue().getNameOfSchool()
            + ". Numbers of students: " + principalEntry.getValue().getSum());
        }

    }
}
