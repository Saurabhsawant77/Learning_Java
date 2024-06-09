package com.Part6_StringBuilder;

public class StringBuilderCode {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        str.append("saurabh");


        System.out.println(str.reverse());

        System.out.println(str);
//        System.out.println(str);

        String a = new String("Saurab");
        String b = new String("Saurab");

        System.out.println(a==b);
        System.out.println(a.equals(b));

        System.out.println(a.charAt(2));


        //fprmatted string

        float ab = 12.243567654f;

        System.out.printf("Formated String is %.2f", ab);

    }
}
