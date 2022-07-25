package com.kodilla.abstracts.homework;

public class Teacher extends Job{

    public static String jobName = "Teacher";

    public Teacher(double salary, String responsibilities) {
        super(5000, "lessons preparing, tests checking, looking after students");
    }
}
