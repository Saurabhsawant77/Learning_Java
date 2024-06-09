package com.Questions.Functions;

import java.util.Scanner;

public class Armstrongno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       boolean b =  armstrongno(n);
        System.out.println(b);
    }

    public static boolean armstrongno(int n){
        int temp = n;
        int ams = 0;
        while (n>0){
            int rem = n%10;
            ams = (int) (ams + Math.pow(rem,3));
            n=n/10;
        }

        if(ams == temp){
            return true;
        }

        return false;

    }
}
