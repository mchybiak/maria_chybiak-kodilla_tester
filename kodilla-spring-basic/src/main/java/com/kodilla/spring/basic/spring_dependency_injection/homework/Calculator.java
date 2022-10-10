package com.kodilla.spring.basic.spring_dependency_injection.homework;
import org.springframework.stereotype.Component;

@Component // klasa Calculator jest komponentem Springa
public class Calculator {
    public Display display; // posiada pole Display display

    public Calculator(Display display) { // wstrzykiwanie przez konstruktor (bez dodatkowych adnotacji)
        this.display = display;
    }


    // Zaimplementuj cztery podstawowe działania matematyczne, powinna przed zwróceniem wyniku wywołać metodę
    // display(double value) obiektu display.


    public double add(double a, double b) {
        return display.display(a + b);
    }

    public double subtract(double a, double b) {
        return display.display(a - b);
    }

    public double multiply(double a, double b) {
        return display.display(a * b);
    }

    public double divide(double a, double b) {
        return display.display(a / b);
    }
}
