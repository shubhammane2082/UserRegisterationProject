package com.java.userRegisteration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Predicate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Testcases {
	
	Predicate<String> validFirstname=n -> n.matches("^[A-Z]{1}[a-zA-Z]{1,}$");
	Predicate<String> validlastname=n -> n.matches("^[A-Z]{1}[a-zA-Z]{1,}$");
	Predicate<String> Validemail=n -> n.matches("[a-z]{1,}[.][a-z]*[@][a-z]{1,}[.][a-z]*[.][a-z]*");
	Predicate<String> validphoneNumber=n -> n.matches("^[0-9]{2}[0-9]{10}$");
	Predicate<String> validPassword=n -> n.matches("^[A-Z]{1,}[A-Za-z0-9]{2,}[@_*]{1,}[0-9]{1,}$");
	Predicate<String> allEmailvalid=n -> n.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
	
	//1.Test Case
		@Test
		public void HappytestforFirstName() {
			 String firstName = "Jos";
		     assertTrue(validFirstname.test(firstName));
		}
		
		//2.Test Case
		@Test
	    public void SadtestforfirstName() {
	        String firstName = "sanju";
	        Predicate<String> validFirstname=n -> n.matches("^[A-Z]{1}[a-zA-Z]{1,}$");
	        assertFalse(validFirstname.test(firstName));
	    }
		
		//3.Test Case
		@Test
		public void HappytestforlastName() {
			 String lastname = "Buttler";
		     assertTrue(validlastname.test(lastname));
		}
		
		//4.Test Case
		@Test
		public void SadtestforlastName() {
			 String lastname = "samson";
		     assertFalse(validlastname.test(lastname));
		}
		
		//5.Test Case
		@Test
		public void Happytestforemail() {
			 String email = "abc.xyz@bl.co.in";
		     assertTrue(Validemail.test(email));
		}
		
		//6.Test Case
		@Test
		public void Sadtestforemail() {
			 String email = "sam.ju@co.in";
		     assertFalse(Validemail.test(email));
		}
		//7.Test Case
		@Test
		public void HappytestforphoneNumber() {
			 String phoneNumber = "919370740128";
		     assertTrue(validphoneNumber.test(phoneNumber));
		}
		
		//8.Test Case
		@Test 
		public void SadtestforphoneNumber() {
			 String phoneNumber = "93707401";
		     assertFalse(validphoneNumber.test(phoneNumber));
		}
		
		//9.Test Case
		@Test
		public void HappytestforPassword() {
			 String password = "Pass@1234";
		     assertTrue(validPassword.test(password));
		}
		
		//10.Test Case
		@Test
		public void SadtestforPassword() {
			 String password = "pass1234";
		     assertFalse(validPassword.test(password));
		}
		
		//11.Test Case
		@Test
		public void HappytesttocheckAllTestCase() {
			boolean result=UserRegistrationsMain.passAlltestCases("Jos", "Buttler", "abc.xyz@bl.co.in", "919370740128", "Pass@1234");
			assertTrue(result);
			
		}
		//12.Test Case
		@Test
		public void SadtesttocheckAllTestCase() 
		{
			boolean result=UserRegistrationsMain.passAlltestCases("sanju", "samson", "abc.xyz@co.in", "9370740128", "Mass1234");
			assertFalse(result);
		}

	//22 Test Case	
	@ParameterizedTest
	@ValueSource(strings = { "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com" })
	public void happyallltestCases(String inputText)
	{
		assertTrue(allEmailvalid.test(inputText));
	}
	
	//33 Test Case
	@ParameterizedTest
	@ValueSource(strings = { "abc",
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
            "abc@gmail.com.1a" })
	public void SadallltestCases(String inputText)
	{
		assertFalse(allEmailvalid.test(inputText));
	}

}
