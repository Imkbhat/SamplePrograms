package com.bob.hms.admin.common.pract;

import java.util.TreeSet;

public class TreesetImpl {

	public static void main(String[] args) {
		TreeSet<Integer> t =  new TreeSet<>(new MyComparator());
		t.add(1);
		t.add(0);
		t.add(5);
		t.add(6);
		t.add(4);
		System.out.println(t);
		
	}

}
