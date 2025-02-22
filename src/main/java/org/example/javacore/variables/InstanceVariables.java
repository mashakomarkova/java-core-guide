package org.example.javacore.variables;

public class InstanceVariables {

    String model = "test";
    static int speed = 1;

    public static void main(String[] args) {
        System.out.println(new InstanceVariables().model);
        System.out.println(speed);
    }


}