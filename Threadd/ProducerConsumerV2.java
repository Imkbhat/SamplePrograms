
import java.util.Queue;
import java.util.LinkedList;

public class ProducerConsumerV2 {

	public static void main(String[] args) throws InterruptedException{
		Buffer buffer = new Buffer(1);

		Thread producerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					buffer.produce();
				} catch(InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		});

		Thread consumerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				try{
					buffer.consume();
				} catch(InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		});

		//start both threads
		producerThread.start();
		consumerThread.start();

		//join both threads
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
			int value = 0;
			while(true) {
				synchronized(this) {
					while(list.size() >= this.size ) {
						//wait consumer to consume
						wait();
					}
					list.add(value);
					System.out.println("Producer Produced "+value);
					value++;
					//Notify and Sleep
					notify();
					Thread.sleep(1000);
				}
			}
		}

		public void consume() throws InterruptedException {
			while(true) {
				synchronized(this) {
					while(list.size() == 0) {
						//wait for producer to produce
						wait();
					}
					int value = list.poll();
					System.out.println("Consumer Consumed "+value);

					//Notify and sleep
					notify();
					Thread.sleep(1000);
				}
			}
		}

	}

}