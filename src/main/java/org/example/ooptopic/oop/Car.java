package org.example.ooptopic.oop;

public class Car extends Vehicle {
    String color;
    public String model;
    private int engineNumber;

    // Constructor (used to create objects)
    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    // Method (Action)
    public void drive() {
        System.out.println("The car is driving at " + speed + " mph.");
    }

    public void startEngine() {
        System.out.println("Start engine");
    }

    public void brake() {
        System.out.println("Brake");
    }

    void setColor(String color) {
        this.color = color;
    }

    private void checkEngine() {
        System.out.println("Check engine");
    }

    protected void accelerate() {
        checkEngine();
        engineNumber = 1;
        super.accelerate();
        System.out.println(speed);
        System.out.println("Accelerate car");
    }

    @Override
    public void start() {
        System.out.println("Start Car");
    }
}
