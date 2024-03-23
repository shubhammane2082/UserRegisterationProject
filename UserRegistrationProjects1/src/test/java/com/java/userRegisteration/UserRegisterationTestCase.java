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
}
