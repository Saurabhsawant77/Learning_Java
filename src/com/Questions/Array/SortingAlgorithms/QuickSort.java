package com.Questions.Array.SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,6,8};
        int n = arr.length;
        int low =0;
        int high = n-1;

        System.out.println(Arrays.toString(quickSort(arr, low, high)));
    }

    public static int[] quickSort(int[] arr,int low,int high){
        if(low < high){
            int pivot = partition2(arr,low,high);

            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
        return arr;
    }

    public static int partition2(int[] arr,int low, int high){
        int pivot = arr[low];
        int i=low;
        int j = high;
        while(i<j){
            while(arr[i] <=  pivot && i <=high -1){
                i++;
            }
            while(arr[j] > pivot && j >= low+1 ){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;

    }

    public static int partition(int[] arr,int low,int high){ //pivot - random,median,first,last
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
//                swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i;
    }
}
