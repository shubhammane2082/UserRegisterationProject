package com.java.userRegisteration;

import static org.junit.Assert.*;

import java.util.function.Predicate;

import org.junit.Test;

public class UserRegisterationTestCase {
	String[] validEmail={ "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"};
	
	String[] InvalidEmail={"abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au"};
	
	Predicate<String> validFirstname=n -> n.matches("^[A-Z]{1}[a-zA-Z]{1,}$");
	Predicate<String> validlastname=n -> n.matches("^[A-Z]{1}[a-zA-Z]{1,}$");
	Predicate<String> Validemail=n -> n.matches("[a-z]{1,}[.][a-z]*[@][a-z]{1,}[.][a-z]*[.][a-z]*");
	Predicate<String> validphoneNumber=n -> n.matches("^[0-9]{2}[0-9]{10}$");
	Predicate<String> validPassword=n -> n.matches("^[A-Z]{1,}[A-Za-z0-9]{2,}[@_*]+[0-9]{1,}$");

	@Test
	public void HappytestforFirstName() {
		 String firstName = "Jos";
	     assertTrue(validFirstname.test(firstName));
	}
	
	@Test
    public void SadtestforfirstName() {
        String firstName = "sanju";
        Predicate<String> validFirstname=n -> n.matches("^[A-Z]{1}[a-zA-Z]{1,}$");
        assertFalse(validFirstname.test(firstName));
    }
	
	@Test
	public void HappytestforlastName() {
		 String lastname = "Buttler";
	     assertTrue(validlastname.test(lastname));
	}
	
	@Test
	public void SadtestforlastName() {
		 String lastname = "samson";
	     assertFalse(validlastname.test(lastname));
	}
	
	@Test
	public void Happytestforemail() {
		 String email = "abc.xyz@bl.co.in";
	     assertTrue(Validemail.test(email));
	}
	
	@Test
	public void Sadtestforemail() {
		 String email = "sam.ju@co.in";
	     assertFalse(Validemail.test(email));
	}
	@Test
	public void HappytestforphoneNumber() {
		 String phoneNumber = "919370740128";
	     assertTrue(validphoneNumber.test(phoneNumber));
	}
	
	@Test
	public void SadtestforphoneNumber() {
		 String phoneNumber = "93707401";
	     assertFalse(validphoneNumber.test(phoneNumber));
	}
	
	@Test
	public void HappytestforPassword() {
		 String password = "Pass@1234";
	     assertTrue(validPassword.test(password));
	}
	
	@Test
	public void SadtestforPassword() {
		 String password = "pass1234";
	     assertFalse(validPassword.test(password));
	}
	
	@Test
	public void HappytesttocheckAllTestCase() {
		boolean result=UserRegistrationsMain.passAlltestCases("Jos", "Buttler", "abc.xyz@bl.co.in", "919370740128", "Pass@1234");
		assertTrue(result);
		
	}
	
	@Test
	public void SadtesttocheckAllTestCase() 
	{
		boolean result=UserRegistrationsMain.passAlltestCases("sanju", "samson", "abc.xyz@co.in", "9370740128", "Mass1234");
		assertFalse(result);
	}
	
	@Test
	public void HappytestforsampleEmails()
	{
	  assertTrue(UserRegistrationsMain.checkAllEmails(validEmail));
	}
	
	@Test
	public void SadtestforsampleEmails() 
	{
	    assertFalse(UserRegistrationsMain.checkAllEmails(InvalidEmail));
	}

}
