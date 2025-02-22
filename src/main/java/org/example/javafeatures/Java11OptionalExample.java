package org.example.javafeatures;

import java.util.Optional;

public class Java11OptionalExample {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java 11");

        System.out.println(optional.isEmpty());  // false

        Optional<String> emptyOptional = Optional.empty();
        emptyOptional.orElseThrow(() -> new IllegalArgumentException("Value is missing"));
    }
}
