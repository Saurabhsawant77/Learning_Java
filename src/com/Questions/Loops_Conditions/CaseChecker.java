package com.Questions.Loops_Conditions;

import java.util.Scanner;

public class CaseChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if(ch>= 'a' && ch <='z' ){
            System.out.println("Correct Case");
        }
        else{
            System.out.println("Incorrect Case");
        }
        System.out.println(ch);


    }
}
