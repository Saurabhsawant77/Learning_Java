package com.Questions.StringsQ;

import java.util.Arrays;

public class ReplaceVowels {
    public static void replaceString(String str){
       char[] ch = str.toCharArray();
       int s = 0;
       int e = str.length()-1;
       while (s<=e){
           while (!isVowel(ch[s]) && s<e){
               s++;
           }
           while (!isVowel(ch[e]) && e>s){
               e--;
           }
           if(s<=e){
               char temp = ch[s];
               ch[s] = ch[e];
               ch[e] = temp;
               s++;
               e--;
           }

       }
        System.out.println(Arrays.toString(ch));
    }
    public static boolean isVowel(char ch){
        String vowel = "aeiou";
        if(vowel.contains(ch+"")){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "hello";
        replaceString(s);
    }
}
