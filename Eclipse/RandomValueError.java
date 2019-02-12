package com.bob.hms.admin.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomValueError {

	public static void main(String[] args) {
		Random rand = new Random();
		Map map = new HashMap<>();
		while(true) {
			int random = rand.nextInt();
			map.put(random, String.valueOf(random));
		}
	}

}
