package com.Questions.Loops_Conditions;

public class Reverseno {
    public static void main(String[] args) {
        int no = 123456789;
        int rev = 0;
        int newno = 0;


        while (no>0){
            int rem = no%10;
            newno = newno*10 + rem;
            no/=10;
        }

        System.out.println(newno);
    }
}
