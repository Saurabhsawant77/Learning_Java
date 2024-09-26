package com.Questions.Array.SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,7,1,8};
        int n = arr.length;
        System.out.println(Arrays.toString(selectionSort(arr, n)));
    }

    public static int[] selectionSort(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            int minind = i;
            for (int j = i+1; j < n; j++) {
                if(arr[minind]>arr[j]){
                    minind = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minind];
            arr[minind] = temp;
        }

        return arr;
    }
}
