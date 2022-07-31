// Utwórz w nim klasę StampsApplication z metodą main.
// Będziemy w niej tworzyli kolekcję znaczków pocztowych.
// Jeżeli jakiś znaczek posiadamy w kilku egzemplarzach, to chcemy, aby w naszym obiekcie
// kolekcji wystąpił tylko raz.


package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Mountain", 2.5, "yes"));
        stamps.add(new Stamp("Sea", 2.7, "no"));
        stamps.add(new Stamp("Mountain", 3.1, "yes"));
        stamps.add(new Stamp("Forest", 2.4, "yes"));
        stamps.add(new Stamp("Sea", 2.7, "no"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);

    }
}
