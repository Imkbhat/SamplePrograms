package com.bob.hms.admin.common;

public class ThredSleepDemo implements Runnable {
	
	Thread t;
	@Override
	public void run() {
		for (int i=0; i<5;i++ ) {
			System.out.println(Thread.currentThread().getName()+ "  " + i); 
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThredSleepDemo());
		t1.start();
		
		Thread t2 = new Thread(new ThredSleepDemo());
		
		t2.start();
	}

}
