package com.bob.hms.admin.common;

public class ExplicitThrowException {

	public static void main(String[] args) {
		try {
			String s = null;
			int len = s.length();
		} catch(NullPointerException ex) {
			System.out.println("Exception caught here and Throwing");
			throw ex;
		}
	}

}
