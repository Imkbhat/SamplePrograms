package com.bob.hms.admin.common;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;


public class ExceptionInheritance {
	
	/*class Parent {
		void method1() throws FileNotFoundException {
			
		}
	}
	
	class Child extends Parent {
		void method1() throws IOException {
			
		}
	}*/
	
	
	public static void main(String[] args) {
		/*throw new RuntimeException(new NullPointerException("this is MAIN EXception"));*/
		try {
			int i = Integer.parseInt("abc");
		}catch(NumberFormatException ex) {
			System.out.println("Handle By This NumberFormatException");
		}catch(Exception ex) {
			System.out.println("Handle By This Exception");
		}
		finally {
			
		}
	}
	
}
