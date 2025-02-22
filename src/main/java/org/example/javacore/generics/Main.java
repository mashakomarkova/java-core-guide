package org.example.javacore.generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Create an ArrayList of String
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
