package com.bob.hms.admin.common;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTries {

	public static void main(String[] args) {/*
		
		List<String> list = new ArrayList();
		list.add("Kiran");
		list.add("Karan");
		list.add("Keran");
		list.add("Koran");
		
		Collections.reverse(list);
		
		List<String> revList = new ArrayList<>();
		for (int i=list.size()-1 ; i >=0 ; --i) {
			revList.add(list.get(i));
		}
	
		
		list = Collections.synchronizedList(list);
		
		synchronized(list) {
			Iterator<String>  it = list.iterator();
			while(it.hasNext()) {
				String name = it.next();
				System.out.println(name);
			}
		}
		
		Vector<String> vect = new Vector<>();
		vect.add("Kiran");
		vect.add("Bhat");
		vect.add("Theerthahalli");
		
		vect.forEach(items -> {System.out.println("Values ======>"+items);});
		System.out.println("===========================");
		revList.forEach(item -> System.out.println(item));
		
		
		list.forEach(item -> System.out.println(item));
		
		System.out.println("After Set Implementation");
		
		Set set = new HashSet<>(list);
		set.forEach(item -> System.out.println(item));
		
		System.out.println("After set back  to  list");
		List l = new ArrayList<>();
		l.addAll(set);
		
		l.forEach(items -> System.out.println(items));
		
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
			if (value.equals("Koran"))
				list.remove(value);
		}
		
		List<Integer> intList = new ArrayList<>();
		intList.add(2);
		intList.add(1);
		intList.add(5);
		intList.add(3);
		intList.add(4);
		
		for (int i=0;i<intList.size();i++) {
			for (int j=intList.size()-1;j>i;j--) {
				if (intList.get(i) > intList.get(j)) {
					int temp = intList.get(i);
					intList.set(i, intList.get(j));
					intList.set(j, temp);
				}
			}
		}
		
		try {
		for(int i : intList) {
			System.out.println("Here is aray +"+i);
		}
		}catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
		
		Error er = new Error();
		
		
	*/}
}
