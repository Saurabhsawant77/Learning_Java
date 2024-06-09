package com.Questions.HashMaps_HashSet;

import java.util.HashMap;

public class SubarraySumEqualtoK {
    public static void main(String[] args) {
        int[] arr = {10,2,-2,-20,10};
        int k= -10;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int ans =0;
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if(hm.containsKey(sum-k)){
                ans += hm.get(sum-k);
            }

            if(hm.containsKey(sum)){
                hm.put(sum,hm.get(sum)+1);
            }
            else{
                hm.put(sum,1);
            }
        }
        System.out.println(ans);
    }

}
