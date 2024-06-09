package com.Questions.HashMaps_HashSet;
import java.util.*;


public class UnionofArrays {
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        System.out.println(unionofArrays(arr1,arr2).size());
    }

    public static ArrayList<Integer> unionofArrays(int[] arr1, int[] arr2){
        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }

        arr.addAll(set);

        System.out.println(set);

        return arr;
    }
}
