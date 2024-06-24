//package com.Questions.StringsQ;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.HashMap;
//
//public class ConvertStringNumberToInteger {
//    public static void main(String[] args) {
//        String str1 = "One Crore Three Lakh Thirty Thousand Four Hundred Thirty Five";
//        String[] str = str1.split(" ");
//        HashMap<String,Integer> map = new HashMap<>();
//        map.put("One",1);
//        map.put("Two",2);
//        map.put("Three",3);
//        map.put("Four",4);
//        map.put("Five",5);
//        map.put("Six",6);
//        map.put("Seven",7);
//        map.put("Eight",8);
//        map.put("Nine",9);
//        map.put("Ten",10);
//        map.put("Twenty",20);
//        map.put("Thirty",30);
//        map.put("Fourty",40);
//        map.put("Fifty",50);
//        map.put("Sixty",60);
//        map.put("Seventy",70);
//        map.put("Eighty",80);
//        map.put("Ninty",90);
//        map.put("Crore" , 10000000);
//        map.put("Ten Lakh" , 1000000);
//        map.put("Lakh" , 100000);
//        map.put("Ten Thousand" , 10000);
//        map.put("Thousand" , 1000);
//        map.put("Hundred" , 100);
//
//        int[] arr = new int[str.length];
//        for(int i=0;i<str.length;i++){
//            arr[i] = map.get(str[i]);
//        }
//        int total = 0;
//        System.out.println(Arrays.toString(arr));
//
//        if(arr.length%2==0){
//        for(int i=arr.length-1;i>=1;i--){
//            total = total + arr[i-1] * arr[i];
//            i--;
//        }
//        }
//        else{
//            for(int i=arr.length-2;i>=1;i--){
//                total = total + arr[i-1] * arr[i];
//                i--;
//            }
//            total = total + arr[arr.length-1];
//        }
//
//        System.out.println(total);
//    }
//
//
//}
package com.Questions.StringsQ;

import java.util.HashMap;

public class ConvertStringNumberToInteger {
    public static void main(String[] args) {
        String str1 = "One Crore Three Lakh Thirty Thousand Four Hundred Thirty Five";
        String[] str = str1.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        map.put("Six", 6);
        map.put("Seven", 7);
        map.put("Eight", 8);
        map.put("Nine", 9);
        map.put("Ten", 10);
        map.put("Twenty", 20);
        map.put("Thirty", 30);
        map.put("Forty", 40);
        map.put("Fifty", 50);
        map.put("Sixty", 60);
        map.put("Seventy", 70);
        map.put("Eighty", 80);
        map.put("Ninety", 90);
        map.put("Crore", 10000000);
        map.put("Lakh", 100000);
        map.put("Thousand", 1000);
        map.put("Hundred", 100);

        int total = 0;
        int currentNumber = 0;

        for (String s : str) {
            if (map.containsKey(s)) {
                int value = map.get(s);
                if (value >= 100) {
                    currentNumber *= value;
                } else {
                    currentNumber += value;
                }

                if (map.containsKey(s) && map.get(s) >= 100) {
                    total += currentNumber;
                    currentNumber = 0;
                }
            }
        }
        total += currentNumber;

        System.out.println("Total: " + total);
    }
}
