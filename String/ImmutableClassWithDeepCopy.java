package com.bob.hms.admin.common.pract;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableClassWithDeepCopy {

	private final int id;
	private final String name;
	
	private final HashMap<String,String> testMap;
	
	private int getId() {
		return id;
	}
	
	private String getName() {
		return name;
	}
	
	public HashMap<String, String> getTestMap () {
		return (HashMap<String, String>) testMap.clone();
	}
	
	
	public ImmutableClassWithDeepCopy(int id, String name, HashMap<String, String> hm) {
		System.out.println("Performing Deep  for Object initialization");
		this.id = id;
		this.name = name;
		String key;
		HashMap<String,String> tempMap=new HashMap<String,String>();
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()) {
			key = it.next();
			tempMap.put(key, hm.get(key));
		}
		this.testMap = tempMap; 
	}
	
	
	
	
	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<String,String>();
		h1.put("1", "first");
		h1.put("2", "Second");
		
		String s = "original";
		int i = 10;
		ImmutableClassWithDeepCopy ce = new ImmutableClassWithDeepCopy(i, s, h1);
		
		System.out.println(s==ce.getName());
		System.out.println(h1 == ce.getTestMap());
		//print the ce values
		System.out.println("ce id:"+ce.getId());
		System.out.println("ce name:"+ce.getName());
		System.out.println("ce testMap:"+ce.getTestMap());
		//change the local variable values
		i=20;
		s="modified";
		h1.put("3", "third");
		//print the values again
		System.out.println("ce id after local variable change:"+ce.getId());
		System.out.println("ce name after local variable change:"+ce.getName());
		System.out.println("ce testMap after local variable change:"+ce.getTestMap());
		
		HashMap<String, String> hmTest = ce.getTestMap();
		hmTest.put("4", "new");
		
		System.out.println("ce testMap after changing variable from accessor methods:"+ce.getTestMap());

	}
	
	/* Produces Output as shown Below:
	 * 
	 Performing Deep  for Object initialization
		true
		false
		ce id:10
		ce name:original
		ce testMap:{1=first, 2=Second}
		ce id after local variable change:10
		ce name after local variable change:original
		ce testMap after local variable change:{1=first, 2=Second}
		ce testMap after changing variable from accessor methods:{1=first, 2=Second}
	 */

}
