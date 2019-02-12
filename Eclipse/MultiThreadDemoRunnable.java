package com.bob.hms.admin.common;

public class MultiThreadDemoRunnable implements Runnable {

	@Override
	public synchronized void run() {
		try {
			System.out.println("Current Thread Id ==> "+Thread.currentThread().getId());
		}catch(Exception Ex) {
			Ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		for(int  i=0; i<10; i++){
			Thread threadObj = new Thread(new MultiThreadDemoRunnable());
			threadObj.start();
		}
	}
}
