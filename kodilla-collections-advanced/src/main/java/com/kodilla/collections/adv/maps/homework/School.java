package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Integer> numberOfStudents = new ArrayList<>();
    private List<String> nameOfSchool = new ArrayList<>();

    public School(List<Integer> numberOfStudents, List<String> nameOfSchool){
        this.numberOfStudents = numberOfStudents;
        this.nameOfSchool = nameOfSchool;
    }

}
