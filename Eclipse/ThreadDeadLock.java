package com.bob.hms.admin.common;

public class ThreadDeadLock {

	public static void main(String[] args) {
		
		try {
			System.out.println("Entering into DeadLock State...");
			Thread.currentThread().join();
			
			 // the following statement will never execute 
            System.out.println("This statement will never execute"); 
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
