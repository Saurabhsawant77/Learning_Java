package com.OOPs.Polymorphism1.MethodOverriding;

class Animal {
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); // Outputs: Some generic animal sound

        Animal cat = new Cat(); // Polymorphism: Cat behaves as an Animal
        cat.sound(); // Outputs: Meow (Cat's version of sound())
    }
}
