package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		myQueue.insert(100);
		myQueue.insert(10);
		myQueue.insert(14);
		myQueue.insert(12);
		myQueue.insert(44);
		// myQueue.insert(99);
		// myQueue.insert(999);
		myQueue.view();
	}

}
