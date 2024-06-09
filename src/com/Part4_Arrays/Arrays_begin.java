package com.Part4_Arrays;

import java.util.Scanner;

public class Arrays_begin {
    
    public static void main(String[] args) {
        
        int[] a = new int[5];


        String[] str = new String[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < (a.length) && i< str.length; i++) {
            System.out.println("Enter Roll no ");
            a[i] = sc.nextInt();
            System.out.println("Enter student name ");
            str[i] = sc.next();
        }

        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j] +" " + str[j]);
        }


        System.out.println(a);
        
    }
}
