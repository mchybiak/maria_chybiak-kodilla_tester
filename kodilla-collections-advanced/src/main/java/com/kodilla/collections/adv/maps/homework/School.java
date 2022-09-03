package com.kodilla.collections.adv.maps.homework;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {

    private List<Integer> numberOfStudents = new ArrayList<>();
    private String nameOfSchool = new String();

    public School(List<Integer> numberOfStudents, String nameOfSchool) {
        this.numberOfStudents = numberOfStudents;
        this.nameOfSchool = nameOfSchool;
    }

    public List<Integer> getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return numberOfStudents.equals(school.numberOfStudents) && nameOfSchool.equals(school.nameOfSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfStudents, nameOfSchool);
    }

    @Override
    public String toString() {
        return "School{" +
                "numberOfStudents=" + numberOfStudents +
                ", nameOfSchool=" + nameOfSchool +
                '}';
    }

    public int getSum() {
        int sum = 0;
        for (int numberOfStudents : numberOfStudents)
            sum += numberOfStudents;
        return sum;
    }
}

