package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>(); // zmienna shapes typu List<Square>
        // + przypisanie pustej kolekcji w postaci obiektu klasy ArrayList

        shapes.add(new Square(10.0)); // Utworzenie 3 nowych obiektów i dodanie ich
        shapes.add(new Square(5.0)); // do kolekcji shapes.
        shapes.add(new Square(3.0));

//Wyświetlanie za pomocą pętli tylko tych obiektów z kolekcji, których pole powierzchni jest większe od 20.

        for (int n = 0; n < shapes.size(); n++) { //pętla for, ze zmienną sterującą n. Wartość zmiennej n będzie zwiększana
            // o jeden w każdej iteracji pętli, poczynając od wartości 0, aż do wartości 2
            // (ponieważ rozmiar kolekcji wynosi 3, a warunek pętli to n < shapes.size().

            Square square = shapes.get(n); // dla każdej kolejnej wartości n, z kolekcji shapes pobierany jest jeden obiekt
            // (o indeksie n) i referencja do niego umieszczana jest w zmiennej square.

            if (square.getArea() > 20) // do wnętrza instrukcji if trafią tylko te obiekty, których pole powierzchni
            // jest większe niż 20 (square.getArea() > 20)

            System.out.println(square + ", area: " + square.getArea()); // Obiekty, które spełniły warunek z linii nr 17,
            // są następnie w linii nr 18 wyświetlane wraz z informacją o obliczonym polu powierzchni.
        }
    }
}
