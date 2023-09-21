package dsa_own;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public ListNode head;

	public boolean insert(int data) {
		// Create new node
		ListNode newNode = new ListNode(data);

		// check if valid node
		if (newNode == null)
			return false;

		// check if list is empty
		// insert new node at head
		if (head == null) {
			this.head = newNode;
			return true;
		}

		// if list is not empty
		// locate last node and insert at end
		ListNode last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
		return true;
	}

	public void display() {
		// Create a temporary node to traverse the linked list
		ListNode current = head;

		// Check if the list is empty
		if (current == null) {
			System.out.println("List is empty");
			return;
		}

		// Traverse the linked list and print the data of each node
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}

		System.out.println();
	}

}