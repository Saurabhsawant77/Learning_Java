package com.Questions.HashMaps_HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionofArrasy {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,6};
        int[] arr2 = {1,7,8,4};
        System.out.println(intersectionofArrays(arr1,arr2).size());
    }

    public static ArrayList<Integer> intersectionofArrays(int[] arr1,int[] arr2){
        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> h1 = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            h1.add(arr1[i]);
        }

        for (int j = 0; j < arr2.length; j++) {
            if(h1.contains(arr2[j])){
                arr.add(arr2[j]);
                h1.remove(arr2[j]);
            }
        }

        System.out.println(arr);
        return arr;
    }
}
