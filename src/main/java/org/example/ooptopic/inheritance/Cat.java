package org.example.ooptopic.inheritance;

public class Cat extends Animal {
    // Overriding the sound method in the subclass
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
