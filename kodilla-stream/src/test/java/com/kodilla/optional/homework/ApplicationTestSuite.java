// W folderze test utwórz pakiet com.kodilla.optional.homework z klasą ApplicationTest .
// Następnie napisz odpowiednie testy, aby pokryć nimi wszystkie przypadki zaimplementowane w zadaniu.



package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTestSuite {

    @Test // sprawdzenie przypisania nauczyciela do ucznia
    public void checkIfReturnCorrectTeacherName() {
        Teacher joannaPolak = new Teacher("Joanna Polak");
        Student annaKowalska = new Student("Anna Kowalska", joannaPolak);
        assertEquals("Joanna Polak", Application.getTeacherName(annaKowalska));
    }

    @Test
    public void checkIfReturnOptionalWhenTeacherIsNull(){
        Student karolinaNowak = new Student("Karolina Nowak", null);
        assertEquals("<undefined>", Application.getTeacherName(karolinaNowak));
    }
}

//  students.add(new Student("Karolina Nowak", null));
// students.add(new Student("Anna Kowalska", joannaPolak));