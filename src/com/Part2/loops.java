package com.Part2;

public class loops {
    public static void main(String[] args) {
        System.out.println("______________ For loop ____________");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("______________ While loop ____________");
        int n = 1;
        while(n<=10){
            System.out.print(n+" ");
            n++;
        }
        System.out.println();
        System.out.println("______________Do While loop ____________");
        int num = 6;
        do{
            System.out.println("Running atleast once");
        }
        while (num<=5);
    }
}
