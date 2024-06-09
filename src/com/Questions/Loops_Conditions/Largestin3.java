package com.Questions.Loops_Conditions;

import java.util.Scanner;

public class Largestin3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        if(a>b){
//            if(a>c){
//                System.out.println(a + " Is the largest among 3");
//            }
//            else{
//                System.out.println(c+ " Is the largest");
//            }
//
//        }
//        else{
//            if(b>c){
//                System.out.println(b + " Is the largest among 3");
//            }
//            else{
//                System.out.println(c+ " Is the largest");
//            }
//        }

        int newMax= 0;

        newMax = Math.max(Math.max(a,b),c);

        System.out.println("New Max with math function " + newMax);

        int max = 0;
        if(a>max){
            max =a;
        }
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;

        }

        System.out.println(max);
    }
}
