package com.Part3_Functions;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        System.out.println(greeting());
        System.out.println(sum());
    }

    public static String greeting(){
        String greet = "Hello Saurabh";
        return greet;
    }

    public static int sum(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int num3 = num1 + num2;

        return num3;
    }



}
