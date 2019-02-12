package com.java.Thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx implements Runnable {

	private String name;
	public ThreadPoolEx(String  name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		try{
		for(int i=0; i <= 5; i++) {
			if(i == 0) {
				Date d = new Date();
				SimpleDateFormat fmt = new SimpleDateFormat("hh:mm:ss");
				System.out.println("Initialization of thread and Task" +name+" at time"+fmt.format(d));
			} else {
				Date d = new Date();
				SimpleDateFormat fmt = new SimpleDateFormat("hh:mm:ss");
				System.out.println("Executing Time for task name -" +name+" at time"+fmt.format(d));
			}
			Thread.sleep(1000);
		}
		System.out.println("Thread "+name+" completed");
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
	public static class Test {
		static final int MAX_T = 3;
		public static void main(String[] args) {
			Runnable t1 = new ThreadPoolEx("Task1");
			Runnable t2 = new ThreadPoolEx("Task2");
			Runnable t3 = new ThreadPoolEx("Task3");
			Runnable t4 = new ThreadPoolEx("Task4");
			Runnable t5 = new ThreadPoolEx("Task5");
			
			ExecutorService ex = Executors.newFixedThreadPool(MAX_T);
			
			ex.execute(t1);
			ex.execute(t2);
			ex.execute(t3);
			ex.execute(t4);
			ex.execute(t5);
			
			
			ex.shutdown();
		}
	}
}
