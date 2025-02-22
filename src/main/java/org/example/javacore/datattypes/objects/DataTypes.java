package org.example.javacore.datattypes.objects;

import java.util.ArrayList;
import java.util.List;

public class DataTypes {


    Person person;

    public static void main(String[] args) {
//        Person person = new Person("some name", 30);
//        System.out.println("Name: " + person.name);
//        System.out.println("Age: " + person.age);
//        person.display();
//        Days day = Days.MONDAY;
        System.out.println(new DataTypes().person);
        String str = "Hello World";
        int[] numbers = {1,2,3,4,5};

        List<String> list = new ArrayList<>();
        list.add("Java");
    }
}

class Person {
    String name;
    int age;
    static int staticValue;
    int value;

    static {
        staticValue = 1;
        System.out.println("Static block: " + staticValue);
    }

    {
        value = 2;
        System.out.println("Dynamic block: " + value);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
interface Vehicle {
    int MAX_SPEED = 120;

    void start();

    default void display() {
        System.out.println("This is vehicle");
    }
}

class Car implements Vehicle {

    @Override
    public void start() {

    }
}
enum Days {MONDAY, TUESDAY, WEDNESDAY}