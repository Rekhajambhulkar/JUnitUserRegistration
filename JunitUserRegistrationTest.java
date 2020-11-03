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

	// Test Case for EmailId return True
	@Test
	public void checkingEmailId() {
		UserValidator user = new UserValidator();
		boolean isEmailId = user.checkEmailId("jambhulkarrekha@gmail.com");
		Assert.assertTrue(isEmailId);
	}

	// Test Case for EmailId return False
	@Test
	public void checkingEmailIdInvalidMustReturnFalse() {
		UserValidator user = new UserValidator();
		boolean isEmailId = user.checkEmailId(".jambhulkarrekha@111");
		Assert.assertFalse(isEmailId);
	}

	// Test Case for MobileNo return True
	@Test
	public void checkingMobileNo() {
		UserValidator user = new UserValidator();
		boolean isMobileNo = user.checkMobileNo("91 9138124143");
		Assert.assertTrue(isMobileNo);
	}
	
	// Test Case for MobileNo return False
	@Test
	public void checkingMobileNoInvalidMustReturnFalse() {
		UserValidator user = new UserValidator();
		boolean isMobileNo = user.checkMobileNo("656965241");
		Assert.assertFalse(isMobileNo);
	}

	// Test Case for Password return True
	@Test
	public void checkingPassWord() {
		UserValidator user = new UserValidator();
		boolean isPassWord = user.checkPassWord("Rekha@123");
		Assert.assertTrue(isPassWord);
	}

	// Test Case for Password return False
	@Test
	public void checkingPassWordInvalidMustReturnFalse() {
		UserValidator user = new UserValidator();
		boolean isPassWord = user.checkPassWord("rek1f");
		Assert.assertFalse(isPassWord);
	}

	//Test case for mood analyzer return HAPPY
	@Test
	public void moodAnalyser_Test_Happy() {
		UserValidator user = new UserValidator();
		String isMoodHappy = user.moodAnalyse("Rekha", "Jambhulkar", "jambhulkarrekha@gmail.com", "91 9822626490", "Rekha@123" );
		Assert.assertEquals("HAPPY", isMoodHappy);
	}
	
	//Test case for mood analyzer return SAD
	@Test
	public void moodAnalyser_Test_SAD() {
		UserValidator user = new UserValidator();
		String isMoodSad = user.moodAnalyse("Rekha", "Jambhulkar", "jambhulkarrekha@gmail.com", "91 9822626490", "Rekha@123" );
		Assert.assertEquals("HAPPY", isMoodSad);
	}
}
