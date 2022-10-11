package com.kodilla.spring.basic.spring_configuration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AnimalFactoryTestSuite {

    // Klasa testowa nadal zawiera metodę testDogCreated z poprzedniego przykładu.
    // Z tego powodu może pojawić się problem z beanem typu Dog. Metoda createDog zawsze zwraca beana typu Dog,
    // a randomAnimal losowo może zwracać takiego beana. Jeżeli tak się stanie, to test testDogCreated nie przejdzie,
    // bo będą dwa beany tego samego typu – Spring nie wybierze jednego. Aby temu zapobiec, usuń test testDogCreated.


  //  @Test
    //public void testDogCreated() {
      //  //Given
        //ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //Dog dog = context.getBean(Dog.class);
        //When
        //String voice = dog.getVoice();
        //Then
        //Assertions.assertEquals("Bark bark", voice);
    //}

    @Test
    public void shouldCreateDogBeanAndFetchByBeanName() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Dog dog = (Dog) context.getBean("createDog");
        //When
        String voice = dog.getVoice();
        //Then
        Assertions.assertEquals("Bark bark", voice);
    }

    @Test
    public void shouldCreateRandomAnimal() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Animal animal = (Animal) context.getBean("randomAnimal");
        //When
        String voice = animal.getVoice();
        System.out.println(voice);
        //Then
        List<String> possibleVoices = Arrays.asList("Bark bark", "Meow meow", "Quack quack");
        Assertions.assertTrue(possibleVoices.contains(voice));
    }
}