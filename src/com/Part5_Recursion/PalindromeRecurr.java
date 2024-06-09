package com.Part5_Recursion;

public class PalindromeRecurr {
    public static void main(String[] args) {
        String st = "SasuaS";
        char[] str = st.toCharArray();
        int s = 0;
        int e = str.length - 1;
        System.out.println(isPalindrome(str, s, e));
    }

    public static boolean isPalindrome(char[] str, int s, int e) {
        while (s <= e) {
            if (str[s] == str[e])
            {
                return isPalindrome(str, s + 1, e - 1);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}