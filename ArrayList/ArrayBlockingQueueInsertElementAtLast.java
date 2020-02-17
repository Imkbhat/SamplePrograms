import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueInsertElementAtLast {
	public static void main(String[] args) throws InterruptedException{
		ArrayBlockingQueue<String> fruitsQueue = new ArrayBlockingQueue<>(5);

		// add elements to queue only space is available oherwise not
		fruitsQueue.offer("apple");
		fruitsQueue.offer("banana");
		fruitsQueue.offer("pineappale");
		fruitsQueue.offer("grapes");
		System.out.println("Queue:" + fruitsQueue);

		// insert at last position
		fruitsQueue.put("orange");
		System.out.println("Latest Queue:" + fruitsQueue);
	}
}

Output:

Queue:[apple, banana, pineappale, grapes]
Latest Queue:[apple, banana, pineappale, grapes, orange]
