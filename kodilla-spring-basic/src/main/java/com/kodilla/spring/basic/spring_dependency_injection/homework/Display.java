// W pakiecie com.kodilla.spring.basic.spring_dependency_injection utwórz pakiet homework, a w nim klasę Display,
// która powinna być komponentem Springa.
//
//Klasa Display powinna mieć metodę display(double value), która otrzymaną wartość wyświetla na ekranie konsoli.


package com.kodilla.spring.basic.spring_dependency_injection.homework;
import org.springframework.stereotype.Component;

@Component //klasa Display jest komponentem Springa
public class Display {

    public double display(double value){ // posiada metodę display (double value)
        System.out.println(value); // otrzymana wartość będzie się wyświetlała w konsoli
        return value;
    }
}
