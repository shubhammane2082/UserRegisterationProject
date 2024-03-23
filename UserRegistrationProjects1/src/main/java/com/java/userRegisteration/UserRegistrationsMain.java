package com.java.userRegisteration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Name : ");
        String firstName = sc.next();
        System.out.println("Enter the Last Name : ");
        String lastName=sc.next();

        if (UserRegistrationsMain.validfirstName(firstName)) {
            System.out.println("You Enter Correct is : " + firstName);
        } else {
            System.out.println("You are not enter correct Name...");
        }
    }

    public static boolean validfirstName(String firstName) 
    {
        String regexPattern = "^[A-Z]{1}[a-zA-Z]{1,}$";
        boolean result = Pattern.matches(regexPattern, firstName);
        return result;
    }
}
