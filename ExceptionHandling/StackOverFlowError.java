package com.bob.hms.admin.common;

public class StackOverFlowError {
	
	public void method1() {
		method2();
	}
	
	public void method2() {
		method3();
	}
	
	public void method3() {
		method1();
	}

	public static void main(String[] args) {
		StackOverFlowError error = new StackOverFlowError();
		try {
		error.method1();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
