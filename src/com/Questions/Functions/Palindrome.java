package com.Questions.Functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        if(palindrome(num)){
            System.out.println("IsPalindrome");
        }
        else{
            System.out.println("NoPalindrome");
        }
    }

    public static boolean palindrome(int n){
        int temp = n;
        int pal = 0;

        while(n>0){
            int rem = n%10;
            pal = pal*10 + rem;
            n=n/10;
        }

        if(temp == pal){
            return true;
        }
        return false;
    }
}
