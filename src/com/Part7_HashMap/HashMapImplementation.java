package com.Part7_HashMap;

import java.util.HashMap;

public class HashMapImplementation {
    public static void main(String[] args) {
        HashMap<String,String> mp = new HashMap<>();
        mp.put("Sau","qwef");

        System.out.println(mp.get("Sau").hashCode());
    }
}
