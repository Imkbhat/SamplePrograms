package com.bob.hms.admin.common.pract;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserialization {

	public static void main(String[] args) throws ClassNotFoundException {
		StudentSerialzation stu = null;
		try {
			FileInputStream str = new FileInputStream("Stu.ser");
			ObjectInputStream ostr = new ObjectInputStream(str);
			stu = (StudentSerialzation) ostr.readObject();
			str.close();
			ostr.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Student Class is not found.");
			cnfe.printStackTrace();
			return;
		}
		
		System.out.println("Student Name: "+stu.getName());
		System.out.println("Student rollNum: "+stu.getRollNum());
		System.out.println("Student Age: "+stu.getAge());
		System.out.println("Student Address: "+stu.getAddress());
		System.out.println("Student Height: "+stu.getHeight());
	}

}


/*
 * Output: 
 * Student Name: Kiran 
 * Student rollNum: 123ABC 
 * Student Age: 28 
 * Student Address: null 
 * Student Height: null
 */


/*
 * De-serialization of Object
 * This class would rebuilt the object of Student class after reading the stream
 * of bytes from the file. Observe the output of this class, student address and
 * student height fields are having null & 0 values consecutively. This is
 * because these fields were declared transient in the Student class.
 */