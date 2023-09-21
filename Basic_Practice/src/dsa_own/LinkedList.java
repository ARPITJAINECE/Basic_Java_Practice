package dsa_own;

public class LinkedList {
	private Node_linkedList head;
	int val;

	public LinkedList() {
		head = null;
	}

	public LinkedList(int val) {
		this.val = val;
	}

	// insertion in the linked list
	// using the boolean return type
	public boolean insertInLinkedList(int data) {
		Node_linkedList newNode = new Node_linkedList(data);
		// if the newNode value is null or empty
		if (newNode == null) {
			return false;
		}
		// if the linked list is empty
		if (head == null) {
			this.head = newNode;
			return true;
		}
		// inserting the newNode in the last
		Node_linkedList last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newNode);
		return true;
	}

	// displaying the contents of the linked list
	public void displayTheContenoOfTheLinkedList() {
		Node_linkedList temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	// for adding the contents of the two linked lists

}
