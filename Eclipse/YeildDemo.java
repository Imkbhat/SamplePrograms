package com.bob.hms.admin.common;

public class YeildDemo extends Thread {
	
	@Override
	public void run() {
		
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName() 
                    + " in control"); 
		}
	}
	
	
	
	public static void main(String[] args) {
		
		YeildDemo demo = new  YeildDemo();
		demo.start();
		demo.setPriority(5);
		
		Yeild2Demo demo2 = new Yeild2Demo();
		demo2.start();
		
		for (int i=0; i<5; i++) {
			Thread.yield();
			demo2.yield();
			System.out.println(Thread.currentThread().getName() 
                    + " in control"); 
		}
	}
	
	static class Yeild2Demo extends Thread {
		
		@Override
		public void run() {
			for(int i=0; i<5; i++) {
				System.out.println(Thread.currentThread().getName() 
	                    + " in control"); 
			}
		}
	}

}
