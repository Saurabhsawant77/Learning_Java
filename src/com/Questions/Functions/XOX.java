package com.Questions.Functions;

import java.util.Arrays;
import java.util.Scanner;

public class XOX {
    public static void main(String[] args) {
        String[][] xox = {{"","",""},{"","",""},{"","",""}};
        boolean flag = true;

        Scanner sc = new Scanner(System.in);
        while (flag){
            generateCord(xox);
            boolean userFlag = true;
            PrintGame(xox);
            while (userFlag){
                System.out.println("Enter Your 1st Cordinate ");
                int a = sc.nextInt();
                System.out.println("Enter Your 2nd Cordinate ");
                int b = sc.nextInt();
                if(xox[a][b].equals("")){
                    userFlag  = false;
                    xox[a][b] = "X";
                }
                else{
                    System.out.println("Enter Valid Cordinates");
                }
            }
            PrintGame(xox);
            if( (xox[0][0].equals(xox[1][1]) && xox[1][1].equals(xox[2][2])) ||(xox[0][0].equals(xox[0][1]) &&xox[0][1].equals(xox[0][2])) ||(xox[0][0].equals(xox[1][0]) && xox[1][0].equals(xox[2][0])) ||(xox[1][0].equals(xox[1][1]) && xox[1][1].equals(xox[1][2])) || (xox[2][0].equals(xox[2][1]) && xox[2][1].equals(xox[2][2])) ||(xox[2][0].equals(xox[1][1]) && xox[1][1].equals(xox[0][2])) ||(xox[0][1].equals(xox[1][1]) && xox[1][1].equals(xox[2][1])) ||(xox[0][2].equals(xox[1][2]) && xox[1][2].equals(xox[2][2])) ){
                System.out.println(xox[0][0] + " is Winner");
                flag = false;
            }
            else{

                System.out.println("Draw");
                flag = false;
            }
        }
    }
    public static void generateCord(String[][] arr){
        boolean flag = true;
        while (flag){
            System.out.println("dsdds");
            int a = (int) (Math.random() * 2)+0;
            int b =  (int) (Math.random() * 2)+0;
            System.out.println(a + " " + b);
            if(arr[a][b].equals("")){
                flag  = false;
                arr[a][b] = "O";
            }
        }

    }

    public static void PrintGame(String arr[][]){
        for (int i = 0; i < arr[0].length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }



    }
}
