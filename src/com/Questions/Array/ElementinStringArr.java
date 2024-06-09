package com.Questions.Array;

public class ElementinStringArr {
    public static void main(String[] args) {
        String str = "Saurabh";
        char key = 'a';

        if(search(str,key)){
            System.out.println("Key Exists");
        }
        else{
            System.out.println("Does Not Exist");
        }
    }

    public static boolean search(String str,char key){
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == key){
//                return true;
//            }
//        }

        for(char ch:str.toCharArray()){
            if(ch == key)
                return true;
        }
        return false;
    }
}
