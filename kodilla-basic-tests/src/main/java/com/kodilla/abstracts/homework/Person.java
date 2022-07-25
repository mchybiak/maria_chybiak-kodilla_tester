package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.Animal;

public class Person {

    private String firstName;
    private int age;
    private String job;

    public Person(String firstName, int age, String job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }


    public String getFirstName(){
        return this.firstName;
    }

    public void printResponsibilities(){
        System.out.println(this.getFirstName() + "'s " + "responsibilities at work are: " );
    }

}