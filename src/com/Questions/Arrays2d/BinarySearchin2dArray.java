package com.Questions.Arrays2d;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchin2dArray {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},{15,25,35,45},{28,29,37,48},{33,34,38,50}};

        System.out.println(Arrays.toString(search(arr,38)));
    }

    public static int[] search(int[][] arr, int target){
        int row =0;
        int col = arr.length-1;
        while (row<arr.length && col>=0) {
            if (arr[row][col] == target) {
                return new int[]{row, col};
            }

            if(arr[row][col] < target){
                row++;
            }
            else {
                col--;
            }

        }

        return new int[]{-1, -1};
    }
}
