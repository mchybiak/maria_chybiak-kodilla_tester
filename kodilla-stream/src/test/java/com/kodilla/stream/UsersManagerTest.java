// Stwórz w pakiecie testowym klasę UsersManagerTest oraz napisz test do metody
// UsersManager.filterChemistGroupUsernames() sprawdzający czy metoda zwraca poprawne wartości
// username dla wszystkich użytkowników z grupy Chemists.

package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test

    public void testFilterChemistGroupUsernames(){
        List<String> result = UsersManager.filterChemistGroupUsernames();
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gale Boetticher");
        assertEquals(expectedList, result);

    }

    @Test

    public void testUsersOlderThanAverageAge(){
        List<String> result = UsersManager.filterUsersOlderThanAverageAge(43);
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gus Firing");
        expectedList.add("Gale Boetticher");
        expectedList.add("Mike Ehrmantraut");

        assertEquals(expectedList, result);

    }

    @Test

    public void testIfUserPostedAnyPost(){
        List<String> result = UsersManager.filterIfUserPostedAnyPost();
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Jessie Pinkman");
        expectedList.add("Tuco Salamanca");
        expectedList.add("Gale Boetticher");

        assertEquals(expectedList, result);

    }
}