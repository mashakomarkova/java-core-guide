package org.example.ooptopic.polymorphism;

public class IncorrectCalculator {
    // Method to add two integers
    public int add(double a, double b) {
        return (int) (a + b);
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
//    public double add(double a, double b) {
//        return a + b;
//    }
}
