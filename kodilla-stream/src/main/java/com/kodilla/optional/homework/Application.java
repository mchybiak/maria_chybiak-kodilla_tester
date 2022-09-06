package com.kodilla.optional.homework;

// Klasę Application z metodą main, a w niej utwórz listę obiektów klasy Student i wypełnij ją przykładowymi danymi.
// Niektórzy uczniowie niech mają przypisanego nauczyciela, a niektórzy nie (wówczas pole teacher = null).
// Następnie przy pomocy pętli for-each wyświetl pary uczeń-nauczyciel (np. w formie "uczeń: Jan Kowalski,
// nauczyciel: Tomasz Nowak"). Wykorzystaj klasę Optional do tego, aby obsłużyć sytuacje, w których teacher == null.
// Wówczas w miejscu danych nauczyciela wyświetl tekst "<undefined>".

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {

        Teacher joannaPolak = new Teacher("Joanna Polak");
        Teacher katarzynaBiała = new Teacher("Katarzyna Biała");
        Teacher annaCzerwona = new Teacher("Anna Czerwona");

        List<Student> students = new ArrayList<>();

        students.add(new Student("Adam Nowak", null));
        students.add(new Student("Anna Kowalska", joannaPolak));
        students.add(new Student("Kamil Czarny", katarzynaBiała));
        students.add(new Student("Karolina Nowak", null));
        students.add(new Student("Mikołaj Zielony", null));
        students.add(new Student("Wiktor Niebieski", annaCzerwona));

        for (Student student : students) {
            Optional<Teacher> optionalName = Optional.ofNullable(student.getTeacher());
            String name = optionalName.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Uczeń: " + student.getName() + " Nauczyciel: " + name);

        }
    }
}
