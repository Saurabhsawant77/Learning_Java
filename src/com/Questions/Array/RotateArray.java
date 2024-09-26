package com.Questions.Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 3;
        System.out.println(Arrays.toString(rotate(arr,k)));
    }
    public static int[] rotate(int[] arr,int k){
        while (k>0){
            arr = reverse(arr);
            k--;
        }

        return arr;
    }
    public static int[] reverse(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
        }

        return arr;
    }
}
