package com.Part3_Functions;

public class Shadowing {
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 92;
        System.out.println(x);

        fun();
    }

    public static void fun(){
        System.out.println(x + " Inside fun");
    }
}
