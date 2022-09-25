package com.kodilla.parametrized_tests.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    public boolean validateUsername(String username) {
        return username.matches("^[a-zA-Z0-9._-]{3,}$"); // username musi zawierać trzy lub więcej znaków.
        // Dopuszczalne znaki to małe i duże litery a-z, cyfry, kropka, myślnik oraz podkreślnik
    }

    public boolean validateEmail(String email) {
        if (null != email) {
            String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            // dopuszczalne znaki małe i duże a-z, 0-9 + @ + dopuszczalne znaki małe i duże a-z, 0-9 + dopuszczalne znaki małe i duże a-z; 1-6 znaków
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
        return false;
    }
}
