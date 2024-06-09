package com.Questions.LeetCode;

public class CountLengthLastWord {
    public static int lengthOfLastWord(String s) {

        int e = s.length()-1;
        int count = 0;

        while(s.charAt(e) == ' '){
            e--;
        }

        while(s.charAt(e) != ' '){
            count++;
            e--;

        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

}
