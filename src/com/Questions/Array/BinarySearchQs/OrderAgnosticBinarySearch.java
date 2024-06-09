package com.Questions.Array.BinarySearchQs;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        //Descending wala binary search ahhe baki kahi nahi same as binary fkt min start end wale veglel lihyche
        int[] arr = {9,7,6,5,4,3,2,-1};
        System.out.println(binarySearchOrderAgnostic(arr,88));
    }

    public static boolean binarySearchOrderAgnostic(int[] arr,int key){
        int s = 0;
        int e = arr.length-1;
        int m = e-(s+e)/2;

        while (s<e){
            if(arr[m] == key){
                return true;
            }
            else if(arr[m]>key){
                s = m+1;
            }
            else {
                e = m-1;
            }
            m = e-(s+e)/2;
        }

        return false;
    }
}
