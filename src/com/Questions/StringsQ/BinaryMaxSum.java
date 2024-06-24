package com.Questions.StringsQ;

import java.util.Arrays;
import java.util.HashMap;

public class BinaryMaxSum {
    public static void main(String[] args) {
        String[] arr = {"101 100" , "110 10" ,"1000 11"};
        int n = arr.length;
        System.out.println(decimaltoBinary(24));
//        System.out.println(maxofBinary(arr,n));
        System.out.println(maxofBinary(arr,n));
    }

    public static String maxofBinary(String[] arr,int n){
        int[] maxArr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            String[] str1 = (str.split(" "));
            int max = 0;
            for (int j = 0; j < str1.length; j++) {
                max += binarytoDecimal(str1[j]);
            }
            maxArr[i] = max;
        }
        int maxi = maxArr[0];
        for (int k = 0; k < maxArr.length; k++) {
            if(maxi < maxArr[k]){
                maxi = maxArr[k];
            }
        }
        return decimaltoBinary(maxi)+" "+ Arrays.toString(maxArr);
    }
    public static int binarytoDecimal(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('1' , 1);
        map.put('0',0);
        int bin = 0;
        for(int i=0;i<str.length();i++){
            int adder = map.get(str.charAt(i));
            bin = bin*10 + adder;
        }
//        System.out.println(bin);
        int decimal = 0;
        int count =0;
        while (bin>0){
            int rem = bin%10;
            decimal = decimal +  rem * (int) Math.pow(2,count);
            bin = bin/10;
            count++;
        }

        return decimal;
    }
    public static int decimaltoBinary(int n){
        int temp = n;
        int bin = 0;
        int count =0;
        int lastly  =0;
        while(temp>0){
            int rem = temp%2;
            bin = bin*10 + rem;
            temp = temp/2;
            count++;
        }
        while (count>0){
            int rem = bin%10;
            lastly = lastly*10+rem;
            bin=bin/10;
            count--;

        }

        return lastly;
    }

}
