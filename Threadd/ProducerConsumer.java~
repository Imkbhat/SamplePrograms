
import java.util.Queue;
import java.util.LinkedList;

public class ProducerConsumer {

	public static void main(String[] args) throws InterruptedException {
	Buffer buffer = new Buffer(2);
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

	Thread consumerThread = new  Thread(new Runnable() {
		@Override
		public void run() {
		try {
		   buffer.consume();
		}  catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		}
	});
	
	//start threads
	producerThread.start();
	consumerThread.start();

	//Join Threads
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
	
	public void produce() throws InterruptedException{
	int value = 0;
	while(true) {
		synchronized(this) {
		while(list.size() >= size) {
			//make wait consumer.
			wait();
		}
		list.add(value);
		System.out.println("Producer Produced :"+value);
		value++;
		
		//Notify and Sleep Thread
		notify();
		Thread.sleep(1000);
		}

	    }
	}

	public void consume() throws InterruptedException {
	while(true) {		
		synchronized(this) {
			while(list.size() == 0) {
			//make wait producer
				wait();	
			}
			int value = list.poll();
			System.out.println("Consumer Consumed  :"+ value);
		//Notify and Sleep
		notify();
		Thread.sleep(1000);
		}
	    }
	}

	}
}
