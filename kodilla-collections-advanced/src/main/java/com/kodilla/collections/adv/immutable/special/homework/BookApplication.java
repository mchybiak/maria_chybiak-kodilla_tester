package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        Book book = BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");
        Book book1 = BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");
        Book book2 = BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");

        String x = "This is string";
        String y = "This is string";

        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);

        System.out.println(x == y);

        System.out.println(book.hashCode() == book1.hashCode());
        System.out.println(book1.hashCode() == book2.hashCode());
        System.out.println(book.hashCode() == book2.hashCode());


    }
}
