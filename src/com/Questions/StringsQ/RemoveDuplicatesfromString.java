package com.Questions.StringsQ;

import java.util.Collections;
import java.util.HashSet;

public class RemoveDuplicatesfromString {
    public static void main(String[] args) {
        String str = "sssssssssssachinnnn";
        System.out.println((removeDuplicates(str)));
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
