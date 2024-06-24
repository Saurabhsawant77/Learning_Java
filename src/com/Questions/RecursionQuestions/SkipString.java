package com.Questions.RecursionQuestions;

import java.util.HashSet;
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

    public static class RemoveDuplicatesfromString {
        public static void removedup(String str,int idx, StringBuilder newStr,boolean[] map){
            if(idx == str.length()){
                System.out.println(newStr.toString());
                return;
            }

            char currchar = str.charAt(idx);
            if(map[currchar - 'a']){
                removedup(str,idx+1,newStr,map);
            }
            else{
                map[currchar-'a'] = true;
                removedup(str,idx+1,newStr.append(currchar),map);
            }

        }
        public static void main(String[] args) {
            String str = "sssssssssssachinnnn";
    //        System.out.println((removeDuplicates(str)));
            boolean[] map = new boolean[26];
            StringBuilder newStr = new StringBuilder();
            removedup(str,0,newStr,map);

        }
        public static String removeDuplicates(String str){
            HashSet<Character> setstr = new HashSet<>();
            String strans = "";
            for(int i=0;i<str.length();i++){
                setstr.add(str.charAt(i));
            }
            for (Character st:setstr){
                strans+=st;
            }

            return strans;
        }


    }
}
