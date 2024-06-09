package com.Part4_Arrays;

import java.util.Arrays;
import java.util.LinkedList;

public class Array_For_Each {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        int[] arr = {1,2,3,4,5};

        for(int num:arr){
            System.out.print(" "+ num);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
