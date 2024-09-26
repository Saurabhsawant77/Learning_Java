package com.Questions.StringsQ;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <=n ; i++) {
            if(isPrime(i)){
                System.out.println("Prime No :" + i);
            }
        }
    }

    public static boolean isPrime(int i){
        if(i<=1){
            return false;
        }

        for (int j = 2; j < i; j++) {
            if(i%j == 0){
                return false;
            }
        }

        return true;
    }
}
