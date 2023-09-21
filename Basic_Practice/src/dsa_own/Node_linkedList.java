package dsa_own;

public class Node_linkedList {
	private int data;
	private Node_linkedList next;

	public Node_linkedList(int data) {
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node_linkedList getNext() {
		return next;
	}

	public void setNext(Node_linkedList next) {
		this.next = next;
	}

}
