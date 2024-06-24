package com.Questions.RecursionQuestions;

public class FriendsProblem {
    public static int friendPair(int n){
        if(n==1 || n==2){
            return n;
        }
        //single
        int fnm1 = friendPair(n-1);

        //pair
        int fnm2 = friendPair(n-2) ;
        int pairWays = fnm2 * (n-1);

        return  fnm1 + pairWays;
    }

    public static void main(String[] args) {
        System.out.println(friendPair(3));
    }
}
