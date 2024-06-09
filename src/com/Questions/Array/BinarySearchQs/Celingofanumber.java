package com.Questions.Array.BinarySearchQs;
import java.util.Arrays;

// Celing of a number Smallest number greater than target number

public class Celingofanumber {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,5,7};
        System.out.println(ceilingOfNumber(arr,8));
    }

    public static int ceilingOfNumber(int[] arr, int key){
        Arrays.sort(arr);
        // target is greater than the greatest number in the array
        if (key > arr[arr.length-1]){
            return -1;
        }

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
        return arr[s];

    }
}
