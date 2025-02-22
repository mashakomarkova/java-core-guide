package org.example.strings.stringbuilderbuffer;

public class Example {

    public static void main(String[] args) {
//        String s = "Hello";
//        for (int i = 0; i < 5; i++) {
//            s += i;// This crea tes a new String object in memory
//        }
//
//        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);  // Output: "Hello World"


        //example of string buffer
//        StringBuffer stringBuffer = new StringBuffer("Hello");
//        stringBuffer.append(" World");
//        System.out.println(stringBuffer);  // Output: "Hello World"

    }
}
