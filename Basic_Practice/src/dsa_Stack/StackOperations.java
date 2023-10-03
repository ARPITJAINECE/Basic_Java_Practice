package dsa_Stack;

public class StackOperations {
	private int[] arr;
	private int size;
	private int top;

	public StackOperations(int size) {
		this.size = size;
		top = -1;
		arr = new int[size];
	}

	// Business logic for isEmpty
	public boolean isEmpty() {
		return top == -1;
	}

	// Business Logic for isFull
	public boolean isFull() {
		return top == (size - 1);
	}

	// Business logic for pushing the element in the Stack
	public boolean push(int data) {
		if (isFull()) {
			return false;
		}
		arr[++top] = data;
		return true;
	}

	// Buusiness logic for poping the element from the stack
	public int pop() {
		if (isEmpty()) {
			return 0;
		}
		return arr[top--];
	}

	// Business logic for peeking the first element from the stack
	public int peek() {
		if (isEmpty()) {
			return 0;
		}
		return arr[top];
	}
}
