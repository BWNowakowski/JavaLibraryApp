package com.github.library.app;

public class LibraryApp {
    private static final String APP_NAME = "Biblioteka v1.3";


    public static void main(String[] args) {
        System.out.println(APP_NAME);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}
