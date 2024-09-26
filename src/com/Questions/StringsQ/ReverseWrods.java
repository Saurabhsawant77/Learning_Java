package com.Questions.StringsQ;

public class ReverseWrods {
    public static void main(String[] args) {
        String str = "The Good   Day";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String str){
        String[] strArr = str.trim().split("\\s+");
        String answer = "";
        int count=0;


        for (int i = 0; i < strArr.length-count; i++) {
            StringBuilder sb = new StringBuilder(strArr[i]);
            sb.reverse();
            answer += sb+" ";

            if(i!= strArr.length-1){
                sb.append(" ");
            }
        }

        return answer.toString();
    }
}
