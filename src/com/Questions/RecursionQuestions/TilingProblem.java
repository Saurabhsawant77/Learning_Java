package com.Questions.RecursionQuestions;

// Given a "2 x n" board and tile of size "2 x 1", count the number of ways a
// tile can be given board using the 2 x 1 tiles.
// (A tile can be placed horizontally or vertically).
public class TilingProblem {

    public static int tilingProblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //vertical choice
        int verticalTilesfnm1 = tilingProblem(n-1);
        // horizontal choice
        int horizontalTilesfnm2 = tilingProblem(n-2);

        int totalways = verticalTilesfnm1 + horizontalTilesfnm2;

        return totalways;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
