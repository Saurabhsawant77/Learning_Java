package com.Questions.Arrays2d;

public class PathWithMinimumSun {
    public static void main(String[] args) {
        int[][] arr = {{2},{3,4},{6,5,-1},{4,1,8,3}};
        System.out.println(pathWithMinimumSum(arr));
    }

    public static int pathWithMinimumSum(int[][] arr){
        if(arr.length == 1){
            return arr[0][0];
        }
        int sum = arr[0][0];
        for (int i = 1; i < arr.length; i++)
        {
            int currSum = Integer.MAX_VALUE;
            for (int j = 0; j <= i; j++)
            {
                currSum = Math.min(currSum,arr[i][j]);
            }
            sum += currSum;
        }

        return sum;
    }
}
//   2
// 1   3
//1 2 3 4
