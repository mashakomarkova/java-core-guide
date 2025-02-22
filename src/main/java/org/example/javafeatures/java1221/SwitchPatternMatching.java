package org.example.javafeatures.java1221;

public class SwitchPatternMatching {

    public static void main(String[] args) {
        Object obj = 123;

        String result = switch (obj) {
            case String s -> "String: " + s;
            case Integer i -> "Integer: " + i;
            case null -> "null value";
            default -> "Unknown type";
        };

        System.out.println(result);  // Output: Integer: 123
    }
}
