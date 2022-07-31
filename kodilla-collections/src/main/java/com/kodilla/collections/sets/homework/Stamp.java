// Utwórz klasę Stamp reprezentującą znaczek pocztowy.
// Klasa powinna mieć pola na nazwę oraz wymiary znaczka,
// a także informację o tym, czy znaczek jest ostemplowany czy nie.
// Wewnątrz metody main stwórz kolekcję znaczków (typu HashSet).
// Sprawdź, czy do kolekcji nie da się dodać kilka razy takiego samego znaczka.


package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String nameofStamp;
    private double stampSize;
    private String stamping;

    public Stamp(String nameofStamp, double stampSize, String stamping){
        this.nameofStamp = nameofStamp;
        this.stampSize = stampSize;
        this.stamping = stamping;
    }

    public String getNameofStamp() {
        return nameofStamp;
    }

    public double getStampSize() {
        return stampSize;
    }

    public String getStamping() {
        return stamping;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampSize, stampSize) == 0 && Objects.equals(nameofStamp, stamp.nameofStamp) && Objects.equals(stamping, stamp.stamping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameofStamp, stampSize, stamping);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "nameofStamp='" + nameofStamp + '\'' +
                ", stampSize=" + stampSize +
                ", stamping='" + stamping + '\'' +
                '}';
    }
}
