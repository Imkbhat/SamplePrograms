package com.bob.hms.admin.common;

public class TestThread extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t = Thread.currentThread();
		System.out.println("Id====> "+t.getId());
		System.out.println("Name ===>" +t.getName());
		System.out.println("Priority====> "+t.getPriority());
		System.out.println("State ==> "+t.getState());
		
		for (int i = 0; i < 5; i++) 
        { 
			System.out.println("Main thread"); 
        } 
		
		
		ChildThread ct = new ChildThread();
		System.out.println("Id ===> "+ct.getId());
		System.out.println("Name ===>" +ct.getName());
		ct.setPriority(MIN_PRIORITY);
		System.out.println("Priority====> "+ct.getPriority());
		System.out.println("State ==> "+ct.getState());
		
	}
	
	static class ChildThread extends Thread {
		
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) 
	        { 
	            System.out.println("Child thread"); 
	        } 
		}
	}

}
