package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest  // username musi zawierać trzy lub więcej znaków.
    // Dopuszczalne znaki to małe i duże litery a-z, cyfry, kropka, myślnik oraz podkreślnik
    @ValueSource( strings = {"mchybiak", "MCHybiak", "ma.ch.", "m-ch", "ch_m", "mch123", "Mc-H1.2_3" })
    public void returnTrueIfUserNameisCorrect(String userName) {
        assertTrue(userValidator.validateUsername(userName));
    }


    @ParameterizedTest
    @ValueSource( strings = {"mc", "m", "12", "m+chybiak", "(m)chybiak", "maria+123", "m,chybiak" })
    public void returnFalseIfUserNameisIncorrect(String userName) {
        assertFalse(userValidator.validateUsername(userName));
    }


    @ParameterizedTest // dopuszczalne znaki małe i duże a-z, 0-9 i - + @ + dopuszczalne znaki małe i duże a-z, 0-9 + dopuszczalne znaki małe i duże a-z; 1-6 znaków
    @ValueSource(strings = {"m.chybiak@gmail.com", "m.chybiak@wp.pl", "mchybiak123@o2.pl", "m-chybiak@onet.pl", "ABC123@wp.pl", "a1b2C4-@gmai.com" })
    public void returnTrueIfEmailAdressIsCorrect (String email) {
        assertTrue(userValidator.validateEmail(email));
    }
    @ParameterizedTest
    @ValueSource(strings =  {"m.chybiak@w.", "mch@@wp.pl", "mc@m.chybiak", "maria+chybiak@wp.pl", "m.chybiak@1.123"})
    public void returnFalseIfEmailAdressIsIncorrect (String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}