package org.example.ooptopic.inheritance;

// Base class: Vehicle
class Vehicle {
    public void startEngine() {
        System.out.println("Vehicle engine started");
    }

    public void stopEngine() {
        System.out.println("Vehicle engine stopped");
    }
}

// Extending Vehicle to Car
class Car extends Vehicle {
    public void openTrunk() {
        System.out.println("Car trunk opened");
    }
}

// Extending Car to ElectricCar (Inheritance Overuse Example)
class ElectricCar extends Car {
    public void chargeBattery() {
        System.out.println("Battery charging...");
    }

    // Electric cars don't have a traditional engine, but we still inherit startEngine()
}

// Extending Car to SportsCar (Inheritance Overuse Example)
class SportsCar extends Car {
    public void enableTurbo() {
        System.out.println("Turbo mode enabled");
    }
}

class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.startEngine();  // Irrelevant for an electric car
        tesla.chargeBattery();

        SportsCar ferrari = new SportsCar();
        ferrari.startEngine();  // Works, but is it really a distinct "Car" functionality?
        ferrari.enableTurbo();
    }
}

