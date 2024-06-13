package com.github.library.app;

import com.github.library.model.Book;

class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.5";

        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, 296, "Greg", "9788373271890" );
        Book book2 = new Book("Książka 2", "Jacek Jackowski", 2000, 402, "Lion", "12346661234451" );
        Book book3 = new Book("Książka 3", "Marek Markowski", 1992, 901, "Rat", "6612362317213" );

        System.out.println(appName);
        System.out.println(book1.getAuthor());
//        book1.setAuthor("");
        System.out.println("Książki dostępne w bibliotece:");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}
