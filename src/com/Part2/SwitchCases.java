package com.Part2;


import com.Part3_Functions.Functions;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruits = in.next();

       char ch[] =  fruits.toCharArray();

        System.out.println(ch[0]);

//        Arrays.sort(ch);

//        for (int i = 0; i < ch.length; i++) {
//            System.out.print(ch[i] + " ");
//        }



        switch (fruits){
            case "apple":
                System.out.println("Helo I am Apple");
                break;

            case "grapes":
                System.out.println("I am Grapes");
                break;

            default:
                System.out.println("Hello I am Default");
        }
        int n = 10;

        switch (n){
            case 5:
                System.out.println("I am 5");
                break;

            case 10:
                System.out.println("I am 10");
                break;
        }


        System.out.println(Functions.greeting());


    }
}
