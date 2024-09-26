// Parent class
class Animal {
    public void eat() {
        System.out.println("This animal is eating.");
    }
}

// Child class
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from the parent class
        dog.bark(); // Defined in the child class
    }
}
