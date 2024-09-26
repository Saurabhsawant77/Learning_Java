package com.OOPs.Abstraction.AbstractClass;

abstract class Vehicle {
    // Abstract method (no implementation)
    abstract void startEngine();

    // Concrete method
    public void fuel() {
        System.out.println("Filling up fuel.");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine(); // Calls the overridden method
        car.fuel();        // Calls the inherited method
    }
}

