package com.Questions;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 0;
        int m = 1;
        System.out.println(l + " " + m);
        for (int i = 2; i <=n; i++) {
            int k = l+m;
            l = m;
            m = k;
            System.out.println(m+" ");
        }

        System.out.println(fib(n));
    }

    public static int fib(int n){
        if(n<=1){
            return n;

        }

        return fib(n-1) + fib(n-2);
    }


}
