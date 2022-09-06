// W folderze test stwórz klasę testową dla ForumState, a w niej testową kolekcję użytkowników.
// Wykonaj testy metod obliczających średnią. Pamiętaj o warunkach brzegowych!


package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ForumState {

    public static List<User> getUsersList() { //klasa testowa z kolekcją użytkowników
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        return users;
    }

    @Test

    public void testPostsAverageOfUsersOlderOrEqualThan40(){ // test dla postsAverageOfUsersOlderOrEqualThan40
        List<User> users = getUsersList();
        double sum = 0;
        int counter = 0;
        for (User user : users){
            if (user.getAge() >= 40){
                sum += user.getNumberOfPost();
                counter ++;
            }
        }

        double average = Forumstats.postsAverageOfUsersOlderOrEqualThan40(users);
        Assertions.assertEquals(sum / counter, average, 0.001);

    }

    @Test

    public void testPostsAverageOfUsersYoungerThan40(){ // test dla postsAverageOfUsersYoungerThan40
        List<User> users = getUsersList();
        double sum = 0;
        int counter = 0;
        for (User user : users){
            if (user.getAge() < 40){
                sum += user.getNumberOfPost();
                counter ++;
            }
        }

        double average = Forumstats.postsAverageOfUsersYoungerThan40(users);
        Assertions.assertEquals(sum / counter, average, 0.001);

    }
}