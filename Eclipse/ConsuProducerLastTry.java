package com.bob.hms.admin.common;

import java.util.LinkedList;
import java.util.Queue;

public class ConsuProducerLastTry {

	public static void main(String[] args) throws InterruptedException {
		Buffer buffer = new Buffer(1);
		
		Thread producerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					buffer.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread consumerThread = new Thread(new Runnable()  {
			
			@Override
			public void run() {
				try {
					buffer.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		producerThread.start();
		consumerThread.start();
		
		producerThread.join();
		consumerThread.join();
	}
	
	static class Buffer {
		private int size;
		private Queue<Integer> list;
		
		public Buffer(int size) {
			list = new LinkedList<Integer>();
			this.size = size;
		}
		
		public void produce() throws InterruptedException {
			int value = 1;
			while(true) {
				synchronized (this) {
					while(list.size() >= size) {
						wait();
					}
					list.add(value);
					System.out.println("Producer has Produced "+value);
					value++;
					
					notify();
					Thread.sleep(1000);
				}
			}
		}
		
		public void consume() throws InterruptedException {
			while(true) {
				synchronized (this) {
					while(list.size() == 0) {
						wait();
					}
					int value = list.poll();
					System.out.println("Cosumer has Consumed "+value);
					
					notify();
					Thread.sleep(1000);
				}
			}
		}
	}
}
