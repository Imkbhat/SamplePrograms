package com.bob.hms.admin.common.pract;

public class StringReverseWithoutUsingCharAt {

	public static void main(String[] args) {
		String abc = "Sachin Tendulkar";
		char[] chars = abc.toCharArray();
		String rev = "";
		for (int i=chars.length-1; i>=0; i--) {
			rev = rev + chars[i];
		}
		
		System.out.println(rev);
	}
}
