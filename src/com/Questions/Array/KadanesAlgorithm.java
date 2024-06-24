package com.Questions.Array;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-1,2,1,4,5};
        System.out.println(kadanesAlgo(arr));
    }

    public static int kadanesAlgo(int[] arr){
        if(arr.length == 1){
            return arr[0];
        }

        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            maxi = Math.max(sum,maxi);
            if(sum<0){
                sum = 0;
            }
        }
        return maxi;
    }
}
