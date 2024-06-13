package com.github.library.app;

import com.github.library.model.Book;

class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.6";

        Book[] books = new Book[1000];

        books[0] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, 296, "Greg", "9788373271890" );
        books[1] = new Book("Książka 2", "Jacek Jackowski", 2000, 402, "Lion", "12346661234451" );
        books[2] = new Book("Książka 3", "Marek Markowski", 1992, 901, "Rat");

        System.out.println(appName);
        System.out.println(books[1].getAuthor());
//        book1.setAuthor("");
        System.out.println("Książki dostępne w bibliotece:");
        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();
    }
}
