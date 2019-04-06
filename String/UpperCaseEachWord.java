package com.string;

public class UpperCaseEachWord {
	
	public static String toUpperCase(String str) {
		
		String[] words = str.split("\\s");
		String afterWords = "";
		for (String w : words) {
			String first = w.substring(0, 1);
			String afterFirst = w.substring(1);
			afterWords+= first.toUpperCase() + afterFirst + " "; 
		}
		return afterWords;
	}

	public static void main(String[] args) {
		
		String str = UpperCaseEachWord.toUpperCase("i am hindu");
		String str1 = UpperCaseEachWord.toUpperCase("i am Indian");
		System.out.println("After UpperCase ===> "+str);
		System.out.println("After UpperCase ===> "+str1);
		
	}

}
