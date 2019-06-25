package com.bob.hms.admin.common.pract;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerializableTest {

	public static void main(String[] args) {
		StudentSerialzation stu = new StudentSerialzation("123ABC", "Kiran", 28, "Bangalore", "6ft");
		
		try {
			FileOutputStream str = new FileOutputStream("Stu.ser");
			ObjectOutputStream ostr = new ObjectOutputStream(str);
			ostr.writeObject(stu);
			str.close();
			ostr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
