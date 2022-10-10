package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
class ShippingCenterTestSuite {


    @Test
    public void packageUnder30kgShouldBeSend(){ // Mając kontekst, możesz pobierać beany i wywoływać poszczególne metody tak, jak ze zwykłych obiektów
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Ul.Wiosenna, Kraków", 10.25);
        Assertions.assertEquals("Package delivered to: Ul.Wiosenna, Kraków", message);
    }

    @Test
    public void packageAbove30kgShouldNotBeSend() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Ul.Wiosenna, Kraków", 30.05);
        Assertions.assertEquals("Package not delivered to: Ul.Wiosenna, Kraków", message);
    }
}