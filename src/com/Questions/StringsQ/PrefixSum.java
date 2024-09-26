package com.Questions.StringsQ;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,5};
        int[] preFix = new int[arr.length];
        int currSumm= 0;
        for(int i = 0 ;i<arr.length;i++){
            preFix[i] = currSumm + arr[i];
            currSumm = preFix[i];
        }
        System.out.println(Arrays.toString(preFix));
    }


}
