package com.github.library.app;

public class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Biblioteka v1.0";
        System.out.println(appName);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}