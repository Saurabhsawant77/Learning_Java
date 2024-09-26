package com.OOPs.Abstraction.InterfaceClass;

interface Playable {
    void play();  // abstract method by default
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing guitar.");
    }
}

public class Main {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        guitar.play(); // Output: Playing guitar
    }
}

