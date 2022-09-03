package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookManager {

    static List<Book> books = new ArrayList<>();
    public static Book createBook(String title, String author){
        Book book = new Book(title, author);
        return new Book(title, author);
    }

    public static void checkingIfExist(Book book){
        if (books.contains(book)){
            System.out.println("You can't add this book. This book already exists.");
        } else {
            books.add(book);
            System.out.println("You can add this book. This book is new.");
        }
    }
}