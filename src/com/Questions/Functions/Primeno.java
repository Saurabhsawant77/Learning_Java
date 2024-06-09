package com.Questions.Functions;

import java.util.Scanner;
import java.util.Set;

public class Primeno {
    public static boolean isPrime(int n){
    if(n==0 || n==1){
        return false;
    }
    for(int i=2;i<n;i++){
        if(n%i == 0){
            return false;
        }
    }
    return true;
    }

    public static void printPrime(int n){

        for (int i = 2; i < n; i++) {
            if(isPrime(i)){
                System.out.print(i+ " ");
            }

        }
    }
    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//
//        int number = sc.nextInt();
//        if(isPrime(number)){
//            System.out.println(number + " is a Prime No");
//        }
//        else{
//            System.out.println(number + " Not a prime no");
//        }


        printPrime(34);
    }
}
