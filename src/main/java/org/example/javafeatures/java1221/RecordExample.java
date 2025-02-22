package org.example.javafeatures.java1221;

record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println(person);  // Output: Person[name=Alice, age=30]
        System.out.println(person.name());  // Output: Alice
        System.out.println(person.age());
    }
}
