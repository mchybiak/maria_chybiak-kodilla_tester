package com.kodilla.spring.basic.spring_dependency_injection;

import com.kodilla.spring.basic.spring_dependency_injection.homework.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest; // Wspomniana adnotacja uruchamia Springowy kontekst
// na czas działania testów. Mając kontekst, możesz pobierać beany i wywoływać poszczególne metody tak,
// jak ze zwykłych obiektów. Jeśli zwracany jest wynik, wystarczy użycie asercji, aby zweryfikować poprawność działania.
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {


    @Test // pobierany jest context Springowy. Wskazanie pakietu pomaga określić zasięg skanowania.
    void add() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class); // Korzystamy z metody getBean(Type.class), która szuka beana określonego typu
        double value = bean.add(1,9);
        Assertions.assertEquals(10,value); // używamy asercji żeby zweryfikować poprawność działania
    }

    @Test
    void subtract() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.subtract(10,6);
        Assertions.assertEquals(4,value);
    }

    @Test
    void multiply() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.multiply(3,4);
        Assertions.assertEquals(12,value);
    }

    @Test
    void divide() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.divide(20,2);
        Assertions.assertEquals(10,value);
    }
}
