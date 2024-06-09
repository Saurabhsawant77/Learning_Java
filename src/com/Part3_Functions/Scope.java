package com.Part3_Functions;

public class Scope {
    public static void main(String[] args) {
       int a = 10;
       int b = 19;

        {
//            inr a = 989;  cant used as already assigned outside the block
            int c = 99;
            a = 11; // reassign the new value to original value
        }
        System.out.println(a);
//        System.out.println(c);

    }

    static void random(){
        System.out.println("Not alowed");
    }
}
