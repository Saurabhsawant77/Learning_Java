package com.Questions.Array;

import java.util.Arrays;

public class MaxinArray {
    public static void main(String[] args) {
        int[] arr = {23,32,3245,321,123};

        macinarray(arr);

//        System.out.println(Arrays.toString(arr));
    }

    public static void macinarray(int[] arr){
        int max = 0;

        if(arr.length == 0){
            System.out.println("Array does not have values");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
