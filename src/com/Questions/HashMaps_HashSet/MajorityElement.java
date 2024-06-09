package com.Questions.HashMaps_HashSet;
import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,1,3,3,1,6};
        majorityElement(arr);
    }

    public static void majorityElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        int max = 0;
        int value =0;
        for (Map.Entry<Integer,Integer> it : map.entrySet()){
            if(it.getValue()>max ){
                max = it.getValue();
                value = it.getKey();

            }
        }

        for (int key:map.keySet()){
            if(map.get(key)>arr.length/3){
                System.out.println(key + " " + map.get(key));
            }
        }
//        if(max > (int)arr.length/2){
//            System.out.println(value + " Has th maximum frequqncy of " +max);
//        }
//        else{
//            System.out.println("There is no maximum frequqncy");
//        }


    }
}
