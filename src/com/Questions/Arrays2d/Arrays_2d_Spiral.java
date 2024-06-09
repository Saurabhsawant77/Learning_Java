package com.Questions.Arrays2d;

public class Arrays_2d_Spiral {
    public static void main(String[] args) {
        int[][] ar2d= {{1,2,3},{4,5,6},{7,8,9}};

        int top =0;
        int bottom = ar2d.length;
        int left = 0;
        int right = ar2d[top].length;
        int i=0;

        System.out.println(top+" "+ bottom+ " "+ left + " " + right);

        for( i=0;i<right;i++){
            System.out.println(ar2d[top][i]);
        }
//
        i=0;
        for (;top<bottom-1;top++) {
            System.out.println(ar2d[top+1][right-1]);
        }
        top = 0;
        for(i = right-1;i>0;i--){
            System.out.println(ar2d[bottom-1][i-1]);
        }
        bottom--;
        top++;
        i=0;
        for(;i<=top;i++){
            System.out.println(ar2d[top][i]);
        }

//        System.out.println(ar2d[bottom-1][i]);

    }
}
