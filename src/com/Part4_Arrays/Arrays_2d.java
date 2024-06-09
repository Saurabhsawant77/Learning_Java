package com.Part4_Arrays;

import java.util.Arrays;

public class Arrays_2d {
    public static void main(String[] args) {
        int[][] a;

        a = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        for(int i = 0;i<a[0].length;i++){
            System.out.println(Arrays.toString(a[i]));
        }


        String[][] xox = {{"X","O","X"},{"O","X","O"},{"O","O","X"}};  //new int[3][3]

        if( (xox[0][0].equals(xox[1][1]) && xox[1][1].equals(xox[2][2])) ||(xox[0][0].equals(xox[0][1]) &&xox[0][1].equals(xox[0][2])) ||(xox[0][0].equals(xox[1][0]) && xox[1][0].equals(xox[2][0])) ||(xox[1][0].equals(xox[1][1]) && xox[1][1].equals(xox[1][2])) || (xox[2][0].equals(xox[2][1]) && xox[2][1].equals(xox[2][2])) ||(xox[2][0].equals(xox[1][1]) && xox[1][1].equals(xox[0][2])) ||(xox[0][1].equals(xox[1][1]) && xox[1][1].equals(xox[2][1])) ||(xox[0][2].equals(xox[1][2]) && xox[1][2].equals(xox[2][2])) ){
            System.out.println(xox[0][0] + " is Winner");
        }
        else{
            System.out.println("Draw");
        }
    }
}
