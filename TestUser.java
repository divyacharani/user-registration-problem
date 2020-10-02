package com.bridgelabz.userRegistration;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUser {

	@Test
	public void happyTest() {
		boolean expected = true;
		assertEquals(expected,UserRegistration.validateFirstName("Divya"));
		assertEquals(expected,UserRegistration.validateLastName("Charani"));
		assertEquals(expected,UserRegistration.validateEmail("abc.xyz@bl.co.in"));
		assertEquals(expected,UserRegistration.validatePhoneNumber("91 9876543210"));
		assertEquals(expected,UserRegistration.validatePassword("1@Divyacharani"));
	}
	
	@Test
	public void sadTest() {
		boolean expected = false;
		assertEquals(expected,UserRegistration.validateFirstName("divya"));
		assertEquals(expected,UserRegistration.validateLastName("Ch"));
		assertEquals(expected,UserRegistration.validateEmail("abc.xyz..co.in"));
		assertEquals(expected,UserRegistration.validatePhoneNumber("91 98765"));
		assertEquals(expected,UserRegistration.validatePassword("@Divyacharani"));
	}

}
