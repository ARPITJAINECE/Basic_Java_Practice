package dsa_DLL;

public class DoublyLL {
	private Node head;

	public DoublyLL() {
		this.head = null;
	}

	// business logic for insertion in the DLL
	public boolean insert(int data) {
		Node newNode = new Node(data);
		// checking that the newnode is null or not
		if (newNode == null) {
			return false;
		}
		// if there is no node in DLL
		if (head == null) {
			head = newNode;
			return true;
		}
		// if there are some nodes in the DLL, so first traverse till the last node and
		// then add that newNode to the last
		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		// setting the connection of last node to the newNode
		last.setNext(newNode);
		// setting the connection of newNode to the last as previous
		newNode.setPrevious(last);
		return true;
	}

	// Business logic for displaying the DLL
	public void displayTheDLL() {
		Node temp = head;
		// traversing till the last node and simultaneously printing the data of the
		// nodes
		while (temp != null) {
			System.out.println(temp.getData() + " ");
			temp = temp.getNext();
		}
	}

	// Business logic to insert the data at a given position
	public boolean insertAtGivenPosition(int data, int position) {
		// checking if the position is -ve and zero
		if (position <= 0) {
			return false;
		}
		// checking if there is no node in the DLL and user entered the psition >1
		if (head == null && position > 1) {
			return false;
		}
		Node newNode = new Node(data);
		// if there is no node in DLL and empty DLL is also a DLL
		if (position == 1) {
			// there are nodes in the DLL and user wants to enter the newNode at position=1
			if (head != null) {
				newNode.setNext(head);
				head.setPrevious(newNode);
			}
			head = newNode;
			return true;
		}
		// inserting the newNode at any location
		// so we need to first iterate till the position-1 using the for loop
		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			// if this is the last node then return
			if (prev == null) {
				return false;
			}
		}
		// here we have reached till the node which is located at the (position-1)th
		// location
		Node next = prev.getNext();
		// setting the connection of the newNode with the previous node
		newNode.setPrevious(prev);
		prev.setNext(newNode);
		// checking whether the node next to the previous node ,i.e next is null or not
		if (next != null) {
			newNode.setNext(next);
			next.setPrevious(newNode);
		}
		return true;
	}

	// Business Logic deleting the node by the value
	public boolean deleteByValue(int value) {
		// check if there is no node in the DLL
		if (head == null) {
			return false;
		}
		// if the node that is to be deleted is the first node only
		if (head.getData() == value) {
			// make connection to the next node to the head to break the connection, means
			// the node will be deleted
			head = head.getNext();
			// checking if there is next node to the previously pointing head is there or
			// not?
			if (head != null) {
				head.setPrevious(null);
			}
			return true;
		}
		// if the node i.e. to be deleted is not the first node
		Node deletable = head;
		while (deletable.getData() != value) {
			deletable = deletable.getNext();
			// checking if the node next to the deletable node is there or not?
			if (deletable == null) {
				return false;
			}
		}
		// now deleting the node by setting the connection of the previous node to the
		// next node of the deletable node
		deletable.getPrevious().setNext(deletable.getNext());
		// now checking that next node to the deletable node is null or not
		// if it is not null then we have to set the connection of the next node to the
		// deletable's previous node
		if (deletable.getNext() != null) {
			deletable.getNext().setPrevious(deletable.getPrevious());
		}
		return true;
	}

	// Business logic to delete the node in the DLL by the position
	public boolean deleteByPosition(int position) {
		// checking that if user has eneterd the -ve position, so return from that.
		if (position <= 0) {
			return false;
		}
		// now checking that if there is no node in the DLL, i.e. the head==null
		if (head == null) {
			return false;
		}
		// if user enetered the position=1
		if (position == 1) {
			// just set the head pointer to its next pointer
			head = head.getNext();
			// check if there are more node after that or not, if no then above step is only
			// required and if yes, then we have to set the node that is next to the head
			// node's connection also
			if (head != null) {
				head.setPrevious(null);
			}
			return true;
		}
		// if the position is somewhere between the DLL
		Node deletable = head;
		// locate the position of the deletable node
		for (int i = 1; i < position; i++) {
			deletable = deletable.getNext();
			// checking if the deletable node is null or not
			if (deletable == null) {
				return false;
			}
		}
		// now deleting the deletable node, setting the previous node's connection to
		// the deletables next node connection
		deletable.getPrevious().setNext(deletable.getNext());
		// now setting the connection of the deletable's next node's connection to the
		// deletable's previous node connection
		// first checking if the next of the deletable's node is there or not
		if (deletable.getNext() != null) {
			deletable.getNext().setPrevious(deletable.getPrevious());
		}
		return true;
	}
}
