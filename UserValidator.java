package com.junituserregistration;

public class UserValidator {

	//Function for Checking the FirstName
	public boolean checkFirstname(String fName) {
		return (fName.matches("^[A-Z][a-z]{2,}"));
	}

	// Function for Checking the LastName
	public boolean checkLastName(String Lname) {
		return (Lname.matches("^[A-Z][a-z]{2,}"));
	}

}

