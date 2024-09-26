package com.OOPs.Encaplusation;

class Person {
    // Private variables, accessible only within this class
    private String name;
    private int age;

    // Public getter method to access private variable name
    public String getName() {
        return name;
    }

    // Public setter method to modify private variable name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Saurabh");
        person.setAge(25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

