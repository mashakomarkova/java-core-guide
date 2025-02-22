package org.example.javacore.garbagecollector;

public class Example {

    int primitiveVar = 10;   // Stored in the heap as part of the object
    String objectVar = "Hello";  // ObjectVar reference is in the heap, "Hello" object in heap

    public static void main(String[] args) {
        int localVar = 5;   // Local variable (primitive) stored in stack
        Example ex = new Example(); // Reference to Example is in the stack, actual object is in heap
    }
}
