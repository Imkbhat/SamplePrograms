package com.bob.hms.admin.common;

public class MultiThreadDemo extends Thread{
	
	public void run() {
		try {
			System.out.println("Current Thread Id "+ Thread.currentThread().getId());
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
			MultiThreadDemo demo = new MultiThreadDemo();
			demo.start();
		}
	}

}
