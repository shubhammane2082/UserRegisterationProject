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
		 String name = "Buttler";
	     assertTrue(UserRegistrationsMain.validlastName(name));
	}
	
	@Test
	public void SadtestforlastName() {
		 String name = "samson";
	     assertFalse(UserRegistrationsMain.validlastName(name));
	}
}
