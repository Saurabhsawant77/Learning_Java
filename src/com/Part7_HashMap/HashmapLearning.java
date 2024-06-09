package com.Part7_HashMap;
import java.util.*;

public class HashmapLearning {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("India",140000000);
        hm.put("China",12000000);
        hm.put("US",300000);

        System.out.println(hm);
        hm.put("US",10000000);
        System.out.println(hm);

        boolean key = hm.containsKey("India");
        boolean val = hm.containsValue(140000000);
        boolean key1 = hm.containsKey("china");
        boolean val1 = hm.containsValue(300000);

        System.out.println("confirming key exists or not "+key + " " + key1);
        System.out.println("confirming key exists or not " +val + " " + val1);


        System.out.println(hm.get("India") + " Getting the value form key"); //Key exists
        System.out.println(hm.get("china")+ " Getting the value form key"); // key doesn't exist alphabetical case

        for (Map.Entry<String,Integer> mp : hm.entrySet()){
            System.out.println("Key = " + mp.getKey() + " Value = " + mp.getValue());
        }


        Set<String> keys = hm.keySet();
        for (String keyy : keys){
            System.out.println("NEW method "+keyy + " " + hm.get(keyy));
        }

        System.out.println("-----------------------------------------------------------------");

        hm.remove("China");
        System.out.println(hm);


    }
}
