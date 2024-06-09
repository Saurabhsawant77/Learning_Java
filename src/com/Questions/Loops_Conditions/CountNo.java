package com.Questions.Loops_Conditions;

public class CountNo {
    public static void main(String[] args) {
        int no = 1230930;
        int cnt = 0 ;
        while(no > 0){
            if(no%10 == 3){
                cnt++;
                no = no/10;
            }
            else{
                no = no/10;
            }
        }

        System.out.println(cnt);
    }
}
