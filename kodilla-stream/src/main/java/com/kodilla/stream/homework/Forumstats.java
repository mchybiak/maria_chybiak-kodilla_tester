// W pakiecie com.kodilla.stream.homework utwórz klasę ForumStats, a w niej dwie metody zwracające średnią liczbę postów
// dla użytkowników z dwóch grup wiekowych oraz metodę main, która wyświetli wyniki metod na konsoli.
// W obu metodach uruchom Stream na kolekcji użytkowników zwracanej przez UsersRepository.
// Przekaż ją jako argument metody (ułatwi to proces testowania).
// W pierwszej metodzie napisz Stream tak, aby obliczył średnią liczbę postów dla użytkowników, których wiek jest >= 40.
// Natomiast kolejny Stream, który obliczy średnią liczbę postów dla użytkowników mających wiek < 40.


package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

import java.util.List;

public class Forumstats {

        public static double postsAverageOfUsersOlderOrEqualThan40(List<User> users){ // średnia liczba postów użytkowników >= 40
                double average = users
                        .stream()// Stream przez który przechodzą obiekty typu User
                        .filter(user -> user.getAge() >= 40) // Filtrujemy użytkowników, zostają tylko >= 40
                        .mapToInt(n -> n.getNumberOfPost()) // Konwersja ze strumienia Stream na strumień liczbowy
                        .average()// średnia wartośc elementów przechodzących przez strumień. Wynik jest typu OptionalDouble
                        .getAsDouble(); // wyciągamy wartość z OptionalDouble
                return average;
        }

        public static double postsAverageOfUsersYoungerThan40(List<User> users){
                double average = users
                        .stream()
                        .filter(user -> user.getAge() <40)
                        .mapToInt(n -> n.getNumberOfPost())
                        .average()
                        .getAsDouble();
                return average;
        }

        public static void main(String[] args) {
                System.out.println(postsAverageOfUsersOlderOrEqualThan40(UserRepository.getUsersList()));
                System.out.println(postsAverageOfUsersYoungerThan40(UserRepository.getUsersList()));
        }
}
