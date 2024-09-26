package com.Questions.StringsQ;

public class Palindrome {
    public static void main(String[] args) {
        String str = "a";
        int s = 0;
        int e = str.length()-1;
        System.out.println(isPal(str,s,e));
    }

    public static boolean isPal(String str, int s, int e){
        if(str.charAt(s) != str.charAt(e)){
            return false;
        }
        if(s<e){
            return  isPal(str,s+1,e-1);
        }

return true;
    }
}
