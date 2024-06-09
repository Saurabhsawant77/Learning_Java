package com.Questions.Array.SortingAlgorithms;

import java.util.Arrays;

public class BubblesortRecursion {
    public static void main(String[] args) {
        int[] arr = {3,4,2,5,2,6,8};
        int s = 0;
        int len = arr.length;
        int key = 4;

        Bubblesortrecursion(arr,len);

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Bubblesortrecursion(int[] arr, int len){
        if(len == 0 ||len ==1) return ;

        for (int i = 0; i <len-1; i++) {
            if (arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            }
        }

        Bubblesortrecursion(arr,len-1);

    }
}
