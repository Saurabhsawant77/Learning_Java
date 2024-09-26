package com.OOPs;

public class A {
    public int a = 10;
    public static void main(String[] args) {
        B bclass = new B();
        System.out.println(bclass.m);

    }
}
 class C extends A{


    public static int mul(int a){

        a = a*a;
        return a;
    }
}

class B extends C {
    int b = a;
    B(){

    }
    int m = C.mul(b);
}

