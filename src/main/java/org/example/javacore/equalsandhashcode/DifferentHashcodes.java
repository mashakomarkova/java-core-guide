package org.example.javacore.equalsandhashcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;

public class DifferentHashcodes {

    public static void main(String[] args) {
        Employee p1 = new Employee("Ann", 1);
        Employee p2 = new Employee("Ann", 1);
        System.out.println(p1.equals(p2));

        HashSet<Employee> set = new HashSet<>();
        set.add(p1);
        System.out.println(set.contains(p2)); // returns false because of different hashcodes
    }
}

class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        //return new Random().nextInt();
        return Objects.hash(id, name);
    }
}