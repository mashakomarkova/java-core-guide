package org.example.ooptopic.polymorphism;


import org.example.ooptopic.inheritance.Animal;
import org.example.ooptopic.inheritance.Cat;
import org.example.ooptopic.inheritance.Dog;

public class Builder {
    Animal build() {
        return new Animal();
    }
}
class CatBuilder extends Builder {
    @Override
    Cat build() {
        return new Cat();
    }
}

class DogBuilder extends Builder {
    @Override
    Dog build() {
        return new Dog();
    }
}
