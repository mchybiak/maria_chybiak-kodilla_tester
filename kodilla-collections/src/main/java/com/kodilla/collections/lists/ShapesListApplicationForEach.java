package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplicationForEach {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>();
        shapes.add(new Square(10.0));
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));

        for (Square square : shapes) { // W linii nr 15 uruchamiana jest pętla for-each na kolekcji shapes.
            // W kolejnych iteracjach kolejne elementy z tej kolekcji będą umieszczane w zmiennej square,
            // która jest typu Square (pętlę for-each najwygodniej czyta się od prawej strony do lewej).
            if (square.getArea() > 20) // Linia nr 16 to sprawdzenie warunku – do wnętrza instrukcji if trafią
                // tylko te obiekty, których pole powierzchni jest większe niż 20 (square.getArea() > 20).
                System.out.println(square + ", area: " + square.getArea()); // Obiekty, które spełniły warunek
            // z linii nr 16, są następnie w linii nr 17 wyświetlane wraz z informacją o obliczonym
            // polu powierzchni.
        }
    }
}