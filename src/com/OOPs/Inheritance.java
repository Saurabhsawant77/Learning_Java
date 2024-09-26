package com.OOPs;

public class Inheritance {
    public int adder(int a,int b){
        return a+b+1;
    }
}

class Child extends Inheritance{

    @Override
    public int adder(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
            Inheritance child = new Child();


        System.out.println(child.adder(1,2));
    }
}

