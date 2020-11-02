package com.junituserregistration;

import org.junit.Assert;
import org.junit.Test;

import com.junituserregistration.UserValidator;

public class JunitAUserRegistrationTest {
	
	//Test Case for FirstName return true
	@Test
	public void checkingFirstname() {
	UserValidator validator = new UserValidator();
	boolean isFirstName = validator.checkFirstname("Rekha");
	Assert.assertTrue(isFirstName);
	}
	
	//Test Case for FirstName return False
	@Test
	public void checkingFirstNameInvalidReturnFalse() {
	UserValidator validator = new UserValidator();
	boolean isFirstName = validator.checkFirstname("riya");
	Assert.assertFalse(isFirstName);
	}

	// Test Case for LastName return True
	@Test
	public void checkingLastName() {
		UserValidator user = new UserValidator();
		boolean isLastName = user.checkLastName("Jambhulkar");
		Assert.assertTrue(isLastName);
	}

	// Test Case for LastName return False
	@Test
	public void checkingLastNameInvalidMustReturnFalse() {
		UserValidator user = new UserValidator();
		boolean isLastName = user.checkLastName("jambhulkar");
		Assert.assertFalse(isLastName);
	}

}
