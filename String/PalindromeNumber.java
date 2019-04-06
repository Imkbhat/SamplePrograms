package com.string;

public class PalindromeNumber {
	
	public static boolean isPalindrome(int number) {
		if (number == reverse(number)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int reverse(int number) {
		int remainder = 0;
		int reverse = 0;
		do {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
			
		} while (number > 0);
		return reverse;
	}

	public static void main(String[] args) {
		boolean isPalindrome = PalindromeNumber.isPalindrome(12345);
		boolean isPalindrome1 = PalindromeNumber.isPalindrome(12321);
		boolean isPalindrome2 = PalindromeNumber.isPalindrome(112211);
		boolean isPalindrome3 = PalindromeNumber.isPalindrome(1123211);
		
		
		System.out.println("isNumPalindrome == " + isPalindrome);
		System.out.println("isNumPalindrome1 == " + isPalindrome1);
		System.out.println("isNumPalindrome2 == " + isPalindrome2);
		System.out.println("isNumPalindrome3 == " + isPalindrome3);
	}

}
