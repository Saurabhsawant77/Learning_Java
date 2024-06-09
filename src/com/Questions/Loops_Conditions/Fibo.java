package com.Questions.Loops_Conditions;

public class Fibo {
    public static void main(String[] args)
    {
        int no = 7;
        int l = 0;
        int m = 1;
        int fibo = 0;

//        System.out.print(l + " " + m+ " ");
//
//        while (no >= 2) {
//            no--;
//            fibo = l + m;
//            l = m;
//            m = fibo;
//            System.out.print( m + " ");
//        }
//        System.out.print( m + " ");

        for (int i = 0; i < no-1; i++) {
            fibo = l + m;
            l = m;
            m = fibo;
        }
        System.out.print( m + " ");
    }
}
