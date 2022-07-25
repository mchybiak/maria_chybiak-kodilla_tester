package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.Animal;

public class Person {

    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }


    public String getFirstName(){
        return this.firstName;
    }

    public void printResponsibilities(){
        System.out.println(getFirstName() + "'s " + "responsibilities at work are: "  + job.getResponsibilities());
    }

}