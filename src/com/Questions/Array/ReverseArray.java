package com.Questions.Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr){
        int s = 0;
        int e = arr.length-1;
       while(s<e){
           SwapElements.swap(arr,s,e);
           s++;
           e--;
       }
    }

//    public static void swap(int[] arr,int i, int j){
//        int temp =  arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

}
