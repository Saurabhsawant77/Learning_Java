package com.OOPs.Polymorphism1.MethodOverloading;

class MathOperations {
    // Overloaded method
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with different parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.add(5, 3));        // Calls 2-parameter add method
        System.out.println(math.add(1, 2, 3));     // Calls 3-parameter add method
    }
}

