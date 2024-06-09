package com.Part2;

public class conditions {
    public static void main(String[] args) {
        int age = 69;

        if(age>=18 && age<=65){
            System.out.println("Eligible for voting");
        }
        else if(age>65){
            System.out.println("Not eligible for voting as age is above 65");
        }
        else{
            System.out.println("Not Eligible age less than 18");
        }
    }
}
