package com.Questions.Array;

public class SumEqualToSubArray {
    public static void main(String[] args) {
        int[] arr = {5,2,-3,1,5};
        int k =11;
        System.out.println(checkSum(arr,k));

    }

    public static boolean checkSum(int[] arr , int k ){
        int left = 0;
        int right = 0;
        int sum = 0;



            while(sum < k && right< arr.length){

                System.out.println(arr[right]);
                sum += arr[right];
                System.out.println(sum + "right");
                right++;
            }

            while(sum >= k && left< arr.length){
                if(sum==k){
                    return true;
                }
                System.out.println(arr[left]);
                sum -= arr[left];
                System.out.println(sum + "left");
                left++;
            }
        return false;
    }
}
