package dsa_Queue;

public class QueueOperations {
	private int[] arr;
	private int size;
	private int front;
	private int rear;

	public QueueOperations(int size) {
		this.size = size;
		arr = new int[size];
		front = -1;
		rear = -1;
	}

	public boolean isEmpty() {
		return ((front == -1 && rear == -1) || (front > rear));
	}

	public boolean isFull() {
		return rear == size - 1;
	}

	// Business Logic to insert the data in the Queue
	public boolean insertInQueue(int data) {
		if (isFull()) {
			return false;
		}
		arr[++rear] = data;
		if (front == -1) {
			front = 0;
		}
		return true;
	}

	// Business Logic to delete the element in the Queue
	public int deleteInTheQueue() {
		if (isEmpty()) {
			return -1;
		}
		return arr[front++];
	}
}
