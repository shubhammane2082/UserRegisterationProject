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
        System.out.println("Enter the Email : ");
		String email=sc.next();
		System.out.println("Enter the Phone No. : ");
		String phoneNumber=sc.next();
		System.out.println("Enter the Password : ");
		String password=sc.next();
		
         try{
        	 if (UserRegistrationsMain.validfirstName(firstName))
                 System.out.println("You Enter Correct First Name is : " + firstName); 
             else 
             	throw new UserRegisterationException("Invalid first Name...");
        }
        catch(Exception e)
        {System.out.println(e.getMessage());}
        
        try {
        	if(UserRegistrationsMain.validlastName(lastName))
         	   System.out.println("You Enter Correct last Name is : " + lastName);
            else
             	throw new UserRegisterationException("Invalid last Name...");
        }catch(Exception e){System.out.println(e.getMessage());}
       
       try {
    	   if(UserRegistrationsMain.validEmail(email))
        	   System.out.println("You Enter Correct Email is : " + email);
           else
            	throw new UserRegisterationException("Invalid Email...");
    	 }catch(Exception e) {System.out.println(e.getMessage());}
       
       try {
    	   if(UserRegistrationsMain.validphoneNumber(phoneNumber))
        	   System.out.println("You Enter Correct Phone Number is : " + phoneNumber);
           else
        	   throw new UserRegisterationException("Invalid Phone Number...");
       }catch(Exception e) {System.out.println(e.getMessage());}
       
       try {
    	   if(UserRegistrationsMain.validatePassword(password))
        	   System.out.println("You Enter Correct Password is : " + password);
           else
        	   throw new UserRegisterationException("Invalid Password...");
         }catch(Exception e) {System.out.println(e.getMessage());}
    }

    public static boolean validfirstName(String firstName) 
    {
        String regexPattern = "^[A-Z]{1}[a-zA-Z]{1,}$";
        boolean result = Pattern.matches(regexPattern, firstName);
        return result;
    }
    
    public static boolean validlastName(String lastName) 
    {
        String regexPattern = "^[A-Z]{1}[a-zA-Z]{1,}$";
        boolean result = Pattern.matches(regexPattern, lastName);
        return result;
    }
    
    public static boolean validEmail(String email)
    {
    	String regexPattern = "[a-z]{1,}[.][a-z]*[@][a-z]{1,}[.][a-z]*[.][a-z]*";
        boolean result = Pattern.matches(regexPattern, email);
        return result;
    }
    public static boolean validphoneNumber(String phoneNumber)
    {
    	String regexPattern = "^[0-9]{2}[0-9]{10}$";
        boolean result = Pattern.matches(regexPattern, phoneNumber);
        return result;
    }
    public static boolean validatePassword(String password) 
	{
		String regexPattern="[A-Z]{1,}[A-Za-z0-9]{2,}[@_*]+[0-9]{1,}";
	    boolean result=Pattern.matches(regexPattern, password);
		return result;
	}
    
    public static boolean checkAllEmails(String[] validEmail)
    {
        String regexPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";;
    	for(String emails : validEmail)
    	{
    		if(!Pattern.matches(regexPattern, emails))
    		{
    			return false;
    		}
    	}
    	return true;
    	
    }
    
    public static boolean passAlltestCases(String firstName,String lastName,String email,String phoneNumber,String password)
    {
    	if(validfirstName(firstName)&&validlastName(lastName)&&validEmail(email)&&validphoneNumber(phoneNumber)&&validatePassword(password)) {
    		return true;
    	}
    	return false;
    }
    
}
