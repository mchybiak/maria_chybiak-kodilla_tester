package com.kodilla.spring.basic.spring_configuration.homework;

// W klasie konfiguracyjnej utwórz metodę, która będzie zwracać beana w zależności od pory roku.
// Jeśli jest lato, chcemy jeździć kabrioletem, zimą SUV-em, wiosną i jesienią sedanem.
// Ponadto samochód powinien mieć włączone światła, jeśli godzina jest w zakresie 20:00 – 06:00.
// Oznacza to, że światła powinny być włączone dokładnie od chwili nastania 20:00 i jednocześnie powinny się wyłączyć, gdy wybije 6:00.

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.MonthDay;

@Configuration
public class CarFactory {
    @Bean
    public Car getCar(){
            Car car;
            MonthDay date = MonthDay.now();
            if (date.isAfter(MonthDay.of(6,1)) && date.isBefore(MonthDay.of(8,31))) {
                car = new Cabrio();
            } else if (date.isAfter(MonthDay.of(12,1)) && date.isBefore(MonthDay.of(2,28))){
                car = new SUV();
            } else {
                car = new Sedan();
            }
            return car;
        }
    }
