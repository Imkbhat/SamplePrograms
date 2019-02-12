package com.bob.hms.admin.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapModification {

	public static void main(String[] args) {
		Map<String, String> newMap = new HashMap<>();
		newMap.put("Kiran", "Shivamogga");
		newMap.put("Vivek", "Hubli");
		newMap.put("Kiran U", "Kalburgi");
		newMap.put("Kruthika", "Theerthahalli");
		
		//ConcurrentModificationException
		/*newMap.forEach((key,value) -> {
			if(key.equals("Kruthika")) {
				newMap.remove(key);
			}
		});*/
		
		//newMap.forEach((key,value) -> {System.out.println("Key====>"+key);});
		
		
		/*Set set = newMap.entrySet();
		Set set2 = newMap.keySet();
		set.forEach(sets -> {System.out.println("Sets  Element+"+sets);} );*/
		
		/*for(Map.Entry<String, String> map : newMap.entrySet()) {
			System.out.println(map);
			String key = map.getKey();
			newMap.remove(key);
		}*/
		
	}

}
