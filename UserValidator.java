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

	// Function for Checking the EmailId
	public static boolean checkEmailId(String EmailId) {
		return (EmailId.matches("^[a-zA-Z]{1,}?[A-Za-z0-9]{0,1}+([-.+]{0,1}+[a-zA-Z0-9]{1,}){0,1}"
				+ "+@+[a-zA-Z0-9]{1,}?([-._]{0,1}+[a-zA-Z0-9]{2,}){0,1}?([-._]{0,1}" + "+[a-zA-Z]{2,}){0,1}"));
	}

	// Function for Checking the MobileNo
	public boolean checkMobileNo(String MobileNo) {
		return (MobileNo.matches("^[0-9]{1,2}[ ][0-9]{10}$"));
	}

	// Function for Checking the PassWord
	public boolean checkPassWord(String Password) {
		return (Password.matches("^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[#@$^+=&%])" + "(?=\\S+$).{8,}$"));

	}

	//Function for Checking Mood id HAPPY OR SAD
	public String moodAnalyse(String fName, String Lname, String EmailId, String MobileNo, String Password) {
		if (checkFirstname(fName) == true && checkLastName(Lname) == true && checkEmailId(EmailId) == true
				&& checkMobileNo(MobileNo) == true && checkPassWord(Password)) {
			return "HAPPY";
		} else {
			return "SAD";
		}

	}
}

