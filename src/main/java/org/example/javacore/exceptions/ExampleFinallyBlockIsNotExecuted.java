package org.example.javacore.exceptions;

public class ExampleFinallyBlockIsNotExecuted {
    public static void main(String[] args) {
//        try {
//            System.out.println("Starting");
//            System.exit(0);
//        } finally {
//            System.out.println("Finally block executed");
//        }

        try {
            System.out.println("Hello");
        } finally {
            throw new RuntimeException();
            //System.out.println("Finally block executed");
        }
    }
}
