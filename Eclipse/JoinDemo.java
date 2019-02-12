package com.bob.hms.admin.common;

public class JoinDemo implements Runnable {
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("===Name===> "+t.getName());
		System.out.println("===isAlive===> "+t.isAlive());
	}

	public static void main(String[] args) throws InterruptedException {
		
		Thread demo = new Thread(new JoinDemo());
		demo.start();
		
		demo.join(1000);
		

        System.out.println("\nJoining after 1000"+ 
                             " mili seconds: \n"); 
        System.out.println("Current thread: " + 
        		demo.getName()); 
  
  
        // Checks if this thread is alive 
        System.out.println("Is alive? " + demo.isAlive()); 
    } 
		
	}	