package com.Part7_HashMap;
import java.util.*;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,2,3,4,5};
        countFreq(arr);
    }

    public static void countFreq(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else {
                map.put(arr[i], 1);
            }

        }

        for (Map.Entry<Integer,Integer> it : map.entrySet()){

            System.out.println("Frequency of " + it.getKey() + " = " + it.getValue());

        }
    }
}
