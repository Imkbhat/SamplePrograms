package com.bob.hms.admin.common;

public class TestException {
	
	public static void validateException(String s) throws PhoneNumberValidateException {
		
		int len = s.length();
		if (len > 10 || len < 10) {
			throw new PhoneNumberValidateException("Invalid Phone Number");
		} else {
			System.out.println("Valid Phone Number");
		}
		
		
	}
	
	public static void main(String[] args) throws PhoneNumberValidateException {
			
		String s = "1234567891123";
		try {
			validateException(s);
		} catch (PhoneNumberValidateException ex) {
			ex.printStackTrace();
		}
	}

}
