package com.bob.hms.admin.common;

import java.util.ArrayList;
import java.util.List;

public class ThrowInsideLamba {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		intList.add(1);
		intList.add(0);
		
		intList.forEach(intEle -> {
		    if (intEle == 0) {
		        throw new IllegalArgumentException("Zero not allowed");
		    }
		    System.out.println(Math.PI / intEle);
		});
	}
}
