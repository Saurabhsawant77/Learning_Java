package com.Questions.RecursionQuestions;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(pad1("", "12"));
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for(int i=(digit -1)*3;i<digit*3;i++){
            char ch = (char) ('a'+i);

            pad(p+ch,up.substring(1));
        }
    }

    static ArrayList<String> pad1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ar = new ArrayList<>();
            ar.add(p);
            return ar;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();

        for(int i=(digit -1)*3;i<digit*3;i++){
            char ch = (char) ('a'+i);

            list.addAll(pad1(p+ch,up.substring(1)));
        }

        return list;
    }
}
