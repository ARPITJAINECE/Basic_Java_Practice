package dsa_own;

import java.util.Stack;

public class LinkedList {
	private Node head;

	public LinkedList() {
		this.head = null;
	}

	// insertion basic
	public boolean insert(int data) {
		Node newNode = new Node(data);
		// if newnode is null
		if (newNode == null) {
			return false;
		}
		// if there is no node in the LL
		if (head == null) {
			this.head = newNode;
			return true;
		}
		// if there are some nodes in the LL and you want to insert the newNode at the
		// end of the LL
		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newNode);
		return true;
	}

	// displaying the elements of the linked list
	public void displayTheElements() {
		Node tempNode = head;
		while (tempNode != null) {
			System.out.println(tempNode.getData() + " ");
			tempNode = tempNode.getNext();
		}
		System.out.println();
	}

	// displaying the LL in the reverse manner
	public void displayTheLLReverse() {
		Node temp = head;
		Stack<Node> stackNode = new Stack<Node>();
		while (temp != null) {
			stackNode.push(temp);
			temp = temp.getNext();
		}
		while (!stackNode.isEmpty()) {
			System.out.println(stackNode.pop().getData() + " ");
		}
	}

	// insertion of the data at a given position
	public boolean insertAtPosition(int data, int pos) {
		// if user has entered the wrong or -ve position
		if (pos <= 0) {
			return false;
		}
		// if LL has no node and still user entered the position greater than 1
		else if (head == null && pos > 1) {
			return false;
		}
		Node newNode = new Node(data);
		// if newNode is null so return
		if (newNode == null) {
			return false;
		}
		// if there is no nodes in the LL, i.e. blank LL
		if (pos == 1) {
//			head.setNext(newNode);---> we will not be doing this as we have to first make the link to the next node
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		// if the position is not at the first position:
		// so locate the previous node also, so as to complete the insertion after that
		// previous node
		Node previous = head;
		for (int i = 1; i < pos - 1; i++) {
			previous = previous.getNext();
			// a quick validation, to check that still previous is null or not
			if (previous == null) {
				return false;
			}
		}
		newNode.setNext(previous.getNext());
		previous.setNext(newNode);
		return true;
	}

	// deleting the node with the help of the value of that specific node
	public boolean deleteByValue(int value) {
		// if the LL is empty, i.e. head is null
		if (head == null) {
			return false;
		}
		// checking if my first node, i.e. the head node is that node only that is to be
		// deleted then just set the next pointer to the next part only
		if (head.getData() == value) {
			head = head.getNext();
			return true;
		}
		// making two nodes prev and del so as to hold the LL after deleting the
		// specific node
		Node previous = head;
		Node deletable = head;
		// locating that node
		while (deletable.getData() != value) {
			previous = deletable;
			deletable = deletable.getNext();
			// performing a quick check that whether LL is null or not
			if (deletable == null) {
				return false;
			}
		}
		previous.setNext(deletable.getNext());
		return true;
	}

	// doing the deletion in the LL by position
	public boolean deleteByPosition(int pos) {
		// if there are nodes in LL or not
		if (head == null || pos <= 0) {
			return false;
		}
		// if the position is 1st
		if (pos == 1) {
			head = head.getNext();
			return true;
		}
		// taking my pointer to the (deletable-1)th position, i.e. to the previous
		// position
		Node previous = head;
		for (int i = 1; i < pos - 1; i++) {
			previous = previous.getNext();
			// a quick validation to check whether previous is only the last node or not
			if (previous.getNext() == null) {
				return false;
			}
		}
		// also assigning the head node to deletable node, to mark the node that is to
		// be deleted
		Node deletable = previous.getNext();
		previous.setNext(deletable.getNext());
		return true;
	}
}
