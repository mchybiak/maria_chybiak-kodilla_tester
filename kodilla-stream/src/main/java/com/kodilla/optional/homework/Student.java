package com.kodilla.optional.homework;

// Klasę Student, zawierającą pola String name oraz Teacher teacher,
// które będzie przechowywało obiekt nauczyciela prowadzącego danego ucznia.
// Wygeneruj też konstruktor i gettery.

public class Student {

    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

}
