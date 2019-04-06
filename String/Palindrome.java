package com.string;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		sb = sb.reverse();
		String revStr = sb.toString();
		
		if (str.equals(revStr)) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		boolean isPalindrome = Palindrome.isPalindrome("nitin");
		boolean isPalindrome2 = Palindrome.isPalindrome("jitin");
		System.out.println("isPalindrome " +isPalindrome);
		System.out.println("isPalindrome2 " +isPalindrome2);
	}

}
