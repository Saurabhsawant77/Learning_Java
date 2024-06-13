package com.Questions.RecursionQuestions;

import java.util.Scanner;

public class CalculatePower {
    public static int powerofxton(int x,int n){
        if(n==0){
            return 1;
        }

        return x * powerofxton(x,n-1);
    }

    public static int optimizedpowerofxton(int x,int n){
        if(n==0){
            return 1;
        }

        int halfpowersquare = optimizedpowerofxton(x,n/2);
        int halfPower = halfpowersquare * halfpowersquare;

        if(n%2 != 0){
            halfPower =  x * optimizedpowerofxton(x,n/2) * optimizedpowerofxton(x,n/2);
        }

        return halfPower;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(optimizedpowerofxton(x,n));
        sc.close();
    }
}
