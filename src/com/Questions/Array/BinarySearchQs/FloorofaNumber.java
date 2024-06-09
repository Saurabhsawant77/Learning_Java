package com.Questions.Array.BinarySearchQs;

import java.util.Arrays;

// Floor of a number Greatest number Smaller than target number
public class FloorofaNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,5,7};
        System.out.println(floorOfNumber(arr,0));
    }

    public static int floorOfNumber(int[] arr, int key){

        if (key < arr[0]){
            return -1;
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int s =0;
        int e = arr.length-1;
        int m = s + (e-s)/2;

        while (s<=e){
//            System.out.println(s+" "+e+" "+m);
            if(key < arr[m] ){
                e=m-1;
            }
            else if(key>arr[m]){
                s = m+1;
            }
            else{
                return m;
            }

            m = s + (e-s)/2;
        }
        return arr[e];

    }
}
