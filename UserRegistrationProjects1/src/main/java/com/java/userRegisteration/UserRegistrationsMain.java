package com.java.userRegisteration;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserRegistrationsMain {
	static Predicate<String> validFirstname=n -> n.matches("^[A-Z]{1}[a-zA-Z]{1,}$");
	static Predicate<String> validlastname=n -> n.matches("^[A-Z]{1}[a-zA-Z]{1,}$");
	static Predicate<String> validEmail=n -> n.matches("[a-z]{1,}[.][a-z]*[@][a-z]{1,}[.][a-z]*[.][a-z]*");
	static Predicate<String> validphoneNumber=n -> n.matches("^[0-9]{2}[0-9]{10}$");
	static Predicate<String> validPassword=n -> n.matches("^[A-Z]{1,}[A-Za-z0-9]{2,}[@_*]+[0-9]{1,}$");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Name : ");
        String firstName = sc.next();
        System.out.println("Enter the Last Name : ");
        String lastName=sc.next();
        System.out.println("Enter the Email : ");
		String email=sc.next();
		System.out.println("Enter the Phone No. : ");
		String phoneNumber=sc.next();
		System.out.println("Enter the Password : ");
		String password=sc.next();
		
         try{
        	 if (validFirstname.test(firstName))
                 System.out.println("You Enter Correct First Name is : " + firstName); 
             else 
             	throw new UserRegisterationException("Invalid first Name...");
        }catch(Exception e){System.out.println(e.getMessage());}
         
        try{
        	if(validlastname.test(lastName))
         	   System.out.println("You Enter Correct last Name is : " + lastName);
            else
             	throw new UserRegisterationException("Invalid last Name...");
        }catch(Exception e){System.out.println(e.getMessage());}
       
       try {
    	   if(validEmail.test(email))
        	   System.out.println("You Enter Correct Email is : " + email);
           else
            	throw new UserRegisterationException("Invalid Email...");
    	 }catch(Exception e) {System.out.println(e.getMessage());}
       
       try {
    	   if(validphoneNumber.test(phoneNumber))
        	   System.out.println("You Enter Correct Phone Number is : " + phoneNumber);
           else
        	   throw new UserRegisterationException("Invalid Phone Number...");
       }catch(Exception e) {System.out.println(e.getMessage());}
       
       try {
    	   if(validPassword.test(password))
        	   System.out.println("You Enter Correct Password is : " + password);
           else
        	   throw new UserRegisterationException("Invalid Password...");
         }catch(Exception e) {System.out.println(e.getMessage());}
    }
    
    public static boolean passAlltestCases(String firstName,String lastName,String email,String phoneNumber,String password)
    {
    	if(validFirstname.test(firstName) && validlastname.test(lastName) && validEmail.test(email) && validphoneNumber.test(phoneNumber) && validPassword.test(password)) {
    		return true;
    	}
    	return false;
    }
    
}
