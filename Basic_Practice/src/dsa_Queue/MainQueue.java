package dsa_Queue;

public class MainQueue {
	public static void main(String[] args) {
		QueueOperations q = new QueueOperations(5);
		System.out.println(q.insertInQueue(10));
		System.out.println(q.insertInQueue(20));
		System.out.println(q.insertInQueue(30));
		System.out.println(q.insertInQueue(40));
		System.out.println(q.insertInQueue(50));
		System.out.println(q.deleteInTheQueue());
	}
}
