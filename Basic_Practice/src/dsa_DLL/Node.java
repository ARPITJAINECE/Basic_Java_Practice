package dsa_DLL;

public class Node {
	private int data;
	private Node previous;
	private Node next;

	public Node(int data) {
		this.data = data;
		previous = null;
		next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getNext() {
		return next;
	}
}
