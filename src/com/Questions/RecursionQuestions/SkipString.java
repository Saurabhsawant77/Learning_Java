package com.Questions.RecursionQuestions;

import java.util.Scanner;

public class SkipString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(skipString(str));
    }

    public static String skipString(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("apple")){
           return skipString(str.substring(5));
        }
        else{
            return str.charAt(0) + skipString(str.substring(1));
        }

    }
}
