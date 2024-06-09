package com.Part4_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        ArrayList<Integer> AList = new ArrayList<>();
//        ArrayList<ArrayList<Integer>> AList1 = new ArrayList<>();
//          //initialization part.
//        for(int i=0;i<5;i++)
//            AList1.add(new ArrayList<>());

//        for (int l = 0; l < 5; l++) {
//            for (int m = 0; m <5; m++) {
//                AList1.get(l).add(sc.nextInt());
//            }
//        }
//        AList1.get(2).add(4);
//
//        AList.add(20);
//        AList.add(90);
//        AList.add(98);
//        AList.set(1,22);
//        AList.remove(2);
//
//        System.out.println( AList.indexOf(98));
//
//        System.out.println(AList);

        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        for (int j = 0; j < 5; j++) {
            System.out.println(list.get(j));
        }

        sc.close();
    }
}
