package com.Part1;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Saurabh Sawant ");
        Scanner sc = new Scanner(System.in);

        int aa = sc.nextInt();
        System.out.println(aa);

        System.out.println("__________________________________________________");

        int[] arr = new int[5];

        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("__________________________________________________");
        int a = sum(10,11);
        System.out.println(a);
    }

    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
}
