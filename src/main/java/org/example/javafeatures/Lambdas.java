package org.example.javafeatures;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("This is runnable implementation");
        };

        Thread thread = new Thread(runnable);

        List<String> names = Arrays.asList("Anna", "John", "Mike");
        Collections.sort(names, (s1, s2) -> s2.compareTo(s1));
        System.out.println(names);
    }
}
