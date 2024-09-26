package com.Questions.StringsQ;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {
    public static void main(String[] args) {
        String str = "rate";
        String str1 = "care";

        char[] ch1 = str.toCharArray();
        char[] ch2 = str1.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        str = new String(ch1);
        str1 = new String(ch2);

        if(str.equals(str1)){
            System.out.println("It is an anagram");
        }
        else {
            System.out.println("Not an anagram");
        }

    }
}
