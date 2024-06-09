package com.Part2;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empid = sc.nextInt();
        String dept = sc.next();

        switch (empid){
            case 10:
                switch (dept){
                    case "IT" :
                        System.out.println("IT department");
                        break;
                    case "Operational":
                        System.out.println("Operational Department");
                        break;
                    default:
                        System.out.println("Department not matched default of " +empid );
                        break;
                }
                break;

            case 11:
                switch (dept){
                    case "Management":
                        System.out.println("Management Department");
                        break;

                    case "HR":
                        System.out.println("Human Resource Department");
                        break;


                    default:
                        System.out.println("Default of "+ empid);
                }
                break;
        }
    }
}
