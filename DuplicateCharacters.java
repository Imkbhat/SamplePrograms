package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void findIt(String input) {
		Map<Character, Integer> baseMap = new HashMap<>();
		char[] charArr = input.toCharArray();
		for (Character c : charArr) {
			if (baseMap.containsKey(c)) {
				baseMap.put(c, baseMap.get(c)+1);
			} else {
				baseMap.put(c, 1);
			}
		}
		
		Set<Character> charSet = baseMap.keySet();
		for (Character c : charSet) {
			if (baseMap.get(c) > 1) {
				System.out.println("Character " + c + " Appears " +baseMap.get(c) +" Times.");
			}
		}
		
	}
	
	public static void main(String[] args) {
		 DuplicateCharacters dcf = new DuplicateCharacters();  
	        dcf.findIt("India is my country");
		
	}

}
