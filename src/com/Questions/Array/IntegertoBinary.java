package com.Questions.Array;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class IntegertoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[32];
        Arrays.fill(arr,0);
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = n%2;
            n = n/2;
            count++;
            System.out.println(n+"---");
            if(n<=0){
                System.out.println("inside if");
                break;
            }

        }
        System.out.println(count);
        int converted = 0;

        for (int j = count-1; j >=0; j--) {

            if(j%2==0){
                arr[j] = 0;
            }

            System.out.print(arr[j]);
            converted = converted + (int) Math.pow(2,j)*arr[j];

        }
        System.out.println();
        System.out.println("Converted Number " + converted);
    }
}
