package com.Questions.RecursionQuestions.SubsetRecursion;

import java.util.ArrayList;

public class SubsetsofGivenString {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(subseqofStringArrayList("",str));
    }

    public static void subseqofString(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseqofString(p+ch,up.substring(1));
        subseqofString(p,up.substring(1));
    }

    public static ArrayList<String> subseqofStringArrayList(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> ar = new ArrayList<>();
            ar.add(p);
            return ar;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqofStringArrayList(p+ch,up.substring(1));
        ArrayList<String> right = subseqofStringArrayList(p,up.substring(1));

        left.addAll(right);

        return left;
    }

}

