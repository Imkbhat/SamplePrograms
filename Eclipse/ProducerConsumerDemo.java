package com.bob.hms.admin.common;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Buffer buffer = new Buffer(2);
		
		//create a producer thread
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
		
		//create a consumer thread
		Thread consumerThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					buffer.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		
		//Start Both Threads
		producerThread.start();
		consumerThread.start();
		
		//Join both Threads
		producerThread.join();
		consumerThread.join();
		
	}
	
	static class Buffer {
		
		private int size;
		public Queue<Integer> list;
		public Buffer(int size) {
			list = new LinkedList<Integer>();
			this.size = size;
		}
		
		
		public void produce() throws InterruptedException {
			int value = 0;
			
			while(true) {
				synchronized (this) {
					while(list.size() >= this.size) {
						//wait the consumer
						wait();
					}
					list.add(value);
					System.out.println("Produced " + value);
                    value++;
                    // notify the consumer
                    notify();
                    Thread.sleep(1000);
				}
			}
		}
		
		public void consume() throws InterruptedException {
			while(true){
				synchronized (this) {
					while(list.size() == 0) {
						//wait the producer
						wait();
					}
					int value = list.poll();
					System.out.println("Consume " + value);
					
					// notify the producer
                    notify();
                    Thread.sleep(1000);
				}
			}
		}
	}
}
