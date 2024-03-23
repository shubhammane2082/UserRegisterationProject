package com.java.userRegisteration;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegisterationTestCase {

	@Test
	public void Happytest() {
		 String name = "Shubham";
	        assertTrue(UserRegistrationsMain.validfirstName(name));
	}
	
	@Test
    public void Sadtest() {
        String name = "shubham";
        assertFalse(UserRegistrationsMain.validfirstName(name));
    }

}
