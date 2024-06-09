package com.Part3_Functions;

import java.util.Arrays;

public class Passingvariablesinparams {
    public static void main(String[] args) {

        String name = "Saurabh Sawant";
        String newName = changeName(name);

        System.out.println(newName);
        int[] arr = {1,3,5,43,33};
        System.out.println(Arrays.toString(arr));
        changeValue(arr);
        System.out.println(Arrays.toString(arr));


    }
    static String changeName(String name) {
        name = "Kartik Shewale";
        return name;
    }
    static void changeValue(int[] arr){
        arr[0] = 22;

    }
}
