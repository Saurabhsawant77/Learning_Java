package com.Questions.StringsQ;

public class MergeAlternate {
    public static String mergeAlternately(String word1, String word2) {
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        StringBuilder str = new StringBuilder();

        int s1 = 0;
        int l1 = ch1.length ;
        int s2 =0;
        int l2 = ch2.length ;

        while(s1<l1 && s2<l2){
            str.append(ch1[s1]);
            str.append(ch2[s2]);
            s1++;
            s2++;
        }
        while(s1<l1){
            str.append(ch1[s1]);
            s1++;
        }

        while(s2<l2){
            str.append(ch2[s2]);
            s2++;
        }

        return str.toString();

    }
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));
    }
}


