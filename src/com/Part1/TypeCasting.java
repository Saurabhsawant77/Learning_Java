package com.Part1;

import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();

        System.out.println(num);

        int i = (int)(78.56454f);
        System.out.println(i);

//        automatic type promotion

        int a = 259;
        byte b = (byte)(a); //257%256 = 1 and it will return 1;
        System.out.println(b);


        int num1 = 'A';

        System.out.println(num1);
        System.out.println("---------------------------------------------------------");
    }
}
