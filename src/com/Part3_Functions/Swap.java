package com.Part3_Functions;

public class Swap {
    public static void main(String[] args) {
    int a =10;
    int b= 11;
        System.out.println(a + " " + b);
        swap(a,b);
        System.out.println(a + " " + b);



    }

    static void swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println(a + " " + b);

        //the change will valid only in this function not anywhere else.
    }
}
