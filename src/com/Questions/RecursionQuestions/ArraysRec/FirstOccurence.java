package com.Questions.RecursionQuestions.ArraysRec;

public class FirstOccurence {
    public static int firstOccurence(int[] arr,int i,int key){
        if(arr[i] == key){
            return i;
        }
        if(arr[i] != key){
            return -1;
        }

        return firstOccurence(arr,i+1,key);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,2,5,7,3};
        System.out.println(firstOccurence(arr,0,8));
    }
}
