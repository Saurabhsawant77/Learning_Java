package com.Part3_Functions;

public class Overloading {
    public static void main(String[] args) {
        fun(32);
        fun("SAURABH");
    }

    public static void fun(int a){
        System.out.println(a);
    }
    public static void fun(String s){
        System.out.println(s);
    }
}
