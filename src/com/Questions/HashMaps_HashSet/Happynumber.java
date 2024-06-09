package com.Questions.HashMaps_HashSet;

import java.util.*;

public class Happynumber {
    public static void main(String[] args) {
        int n =19;
        System.out.println(ishappyNumber(n));
    }
    public static boolean ishappyNumber(int n){
        while(happyNumber(n) != 1){
            System.out.println(happyNumber(n));
            n = happyNumber(n);
        }
        return true;
    }

    public static int happyNumber(int n){
        int temp = n;
        int ans = 0;
        while(temp!=0){
            int rem = temp%10;
            ans = ans + (int)Math.pow(rem,2);
            temp = temp/10;
        }

        return ans;
    }
}
