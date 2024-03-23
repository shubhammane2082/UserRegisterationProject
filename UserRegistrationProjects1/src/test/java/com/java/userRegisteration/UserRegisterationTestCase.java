package com.java.userRegisteration;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegisterationTestCase {

	@Test
	public void HappytestforFirstName() {
		 String name = "Jos";
	        assertTrue(UserRegistrationsMain.validfirstName(name));
	}
	
	@Test
    public void SadtestforfirstName() {
        String name = "sanju";
        assertFalse(UserRegistrationsMain.validfirstName(name));
    }
	
	@Test
	public void HappytestforlastName() {
		 String lastname = "Buttler";
	     assertTrue(UserRegistrationsMain.validlastName(lastname));
	}
	
	@Test
	public void SadtestforlastName() {
		 String lastname = "samson";
	     assertFalse(UserRegistrationsMain.validlastName(lastname));
	}
	
	@Test
	public void Happytestforemail() {
		 String email = "abc.xyz@bl.co.in";
	     assertTrue(UserRegistrationsMain.validEmail(email));
	}
	
	@Test
	public void Sadtestforemail() {
		 String email = "sam.su@co.in";
	     assertFalse(UserRegistrationsMain.validEmail(email));
	}
	@Test
	public void HappytestforphoneNumber() {
		 String phoneNumber = "919370740128";
	     assertTrue(UserRegistrationsMain.validphoneNumber(phoneNumber));
	}
	
	@Test
	public void SadtestforphoneNumber() {
		 String phoneNumber = "93707401";
	     assertFalse(UserRegistrationsMain.validphoneNumber(phoneNumber));
	}
	
	@Test
	public void HappytestforPassword() {
		 String password = "Pass@1234";
	     assertTrue(UserRegistrationsMain.validatePassword(password));
	}
	
	@Test
	public void SadtestforPassword() {
		 String password = "pass1234";
	     assertFalse(UserRegistrationsMain.validatePassword(password));
	}
	

	@Test
	public void HappytestforsampleEmails() 
	{
		String[] validEmail={ "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com"};
	    assertTrue(UserRegistrationsMain.checkAllpassword(validEmail));
	}
	
	@Test
	public void SadtestforsampleEmails() 
	{
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
	    assertFalse(UserRegistrationsMain.checkAllpassword(InvalidEmail));
	}
}
