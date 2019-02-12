package com.bob.hms.admin.common;

public class ThreadNaming extends Thread {
	
	public ThreadNaming(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("Thread Running,,,,.....");
	}

	public static void main(String[] args) {
		ThreadNaming t1 = new ThreadNaming("Kiran1");
		ThreadNaming t2 = new ThreadNaming("Bhat");
		ThreadNaming t3 = new ThreadNaming("Thirthahalli");
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		
	}

}
