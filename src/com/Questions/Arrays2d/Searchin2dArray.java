package com.Questions.Arrays2d;

import java.util.Arrays;
import java.util.Scanner;

public class Searchin2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,3,42,3},{4,3,2,2},{6,566,43,22},{87,86,65,56}};
        int key = sc.nextInt();

       int[] ans = searchin2d(arr,key);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchin2d(int[][] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==key){
                    System.out.println("Key found at index "+i+", "+j);
                    return new int[]{i,j};
                }


            }

        }
        return new int[]{-1,-1};
    }
}
