package com.Part3_Functions;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        func(1,2,3,4,5,6,7,8,90,6,67,7,7,766,21);

        func();
    }

    public static void func(int ...a){
        System.out.println(Arrays.toString(a));
    }
    public static void MultipleDataTypes(int a, int b, String ...s){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(s));
    }
}
