package com.ArrayList;

import java.util.ArrayList;

public class CustomArrayList {

	int size =4;
	class Data {
		
		
		private String name;
		private int marks;
		private int rollno;
		private long phoneNum;
		
		public Data(String name, int marks, int rollno, long phoneNum) {
			this.name = name;
			this.marks = marks;
			this.rollno = rollno;
			this.phoneNum = phoneNum;
		}
		
	}
	
	public static void main(String[] args) {
		int roll[] = {1,2,3,4};
		int marks[] = {100,200,300,400};
		String[] names = {"Kiran","Mugor","Agastya","Bala"};
		long[] phones = {123456789,21111111, 12344555, 12333333};
		
		CustomArrayList arrayList = new CustomArrayList();
		
		arrayList.addValues(names, marks, roll, phones);
	}
	
	public void addValues(String[] names, int[] marks, int[] roll, long[] phones) {
		
		ArrayList<Data> list = new ArrayList<>();
		for (int i=0;i<size; i++) {
			list.add(new Data(names[i], marks[i], roll[i], phones[i]));
		}
		printValues(list);
	}
	
	public void printValues(ArrayList<Data> list) {
			
		for (int i=0; i<list.size(); i++) {
			Data data = list.get(i);
			System.out.println("Name => "+data.name +" Roll==> "+data.rollno +" Marks ==> "+data.marks +" Phones ==>"+data.phoneNum);
		}
	}
}
