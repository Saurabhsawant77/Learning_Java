package com.Questions.RecursionQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveAs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
//        System.out.println(removeas("",str));
        System.out.println(skip(str));
    }

    public static void removeas(String n,String str){
         if(str.isEmpty()){
             System.out.println(n);
             return;
         }

         char ch = str.charAt(0);
         if(ch == 'a'){
             removeas(n,str.substring(1));
         }
         else{
             removeas(n+ch,str.substring(1));
         }


    }


    public static String skip(String str){
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);
        if(ch == 'a'){
           return skip(str.substring(1));
        }
        else{
           return ch+skip(str.substring(1));
        }
    }
}
