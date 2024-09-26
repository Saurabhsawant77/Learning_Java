package com.Questions.StringsQ;


import java.util.Arrays;

public class ReverseaString {
    public static void main(String[] args) {
        String str  = "Saurabh";
        reverseStr(str);

    }

    public static String reverseStr(String str){
        char[] ch = new char[str.length()];
        int count = 0;
        String st = "";
        for (int i = ch.length-1; i>=0; i--) {
            ch[count] = str.charAt(i);
            st += str.charAt(i)+"";
            count++;
        }
        System.out.println(Arrays.toString(ch));
        System.out.println(st);

        return "";


    }
}
