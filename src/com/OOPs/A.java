package com.OOPs;

public class A {
    public static class c{
        public int a = 10;

        public static int mul(int a){
            a = a*a;
            return a;
        }
    }
    public static class B extends c{
        int b = a;
        B(){

        }
        int m = c.mul(b);
    }

    public static void main(String[] args) {
        B bclass = new B();
        System.out.println(bclass.m);

    }
}

