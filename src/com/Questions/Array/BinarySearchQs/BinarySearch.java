package com.Questions.Array.BinarySearchQs;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,7));
    }

    public static int binarySearch(int[] arr, int key){
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

        return -1;
    }
}
