package dsa_CLL;

public class CircularlyLinkedList {
	private Node head;

	public CircularlyLinkedList() {
		head = null;
	}

	// Business Logic to insert the data in the CLL
	public boolean insert(int data) {
		Node newNode = new Node(data);
		// check if there is new node or not...
		if (newNode == null) {
			return false;
		}
		// check if there is some nodes in CLL or not or it is empty
		if (head == null) {
			// making newNode as the first node in the CLL
			head = newNode;
			// making the circular connection of the next part of the CLL to itself as it is
			// the only node in the whole CLL
			newNode.setNext(newNode);
			return true;
		}
		// now adding the newNode to the last of the CLL
		Node last = head;
		// traversing to the last node
		while (last.getNext() != head) {
			last = last.getNext();
		}
		// making connection of the last node to the new node
		last.setNext(newNode);
		// making the newNode having the connection with the head of the full CLL
		newNode.setNext(head);
		return true;
	}

	// Business Logic to display all the nodes in the CLL
	public void displayTheNodesInTheCLL() {
		// first check whether the CLL is empty or not?
		if (head == null) {
			return;
		}
		Node temp = head;
//		while (temp.getNext() != head) {
//			System.out.print(temp.getData() + " ");
//			temp = temp.getNext();
//		}
		// we will not be using upper looping condition as it will be making the problem
		// so go for downwards looping condition
		do {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		} while (temp != head);
	}

	// Business Logic to insert the data at the given position in the CLL
	public boolean insertAtGivenPosition(int data, int position) {
		// check if the position entered by the user is non -ve and non zero
		if (position <= 0) {
			return false;
		}
		// suppose the CLL is empty and the user entered the position >1, i.e. only the
		// first position is allowed
		if (head == null && position > 1) {
			return false;
		}
		Node newNode = new Node(data);
		// check if the user has entered the data or not
		if (newNode == null) {
			return false;
		}
		// if user has entered the first position
		if (position == 1) {
			// if the CLL is empty
			if (head == null) {
				head = newNode;
				newNode.setNext(head);
				return true;
			}
			// if the CLL is not empty
			newNode.setNext(head);
			// since we have made the connection of head and newNode, now we have to make
			// the Linked List circular with the new entered node

			// to do so for the above condition, first we have to traverse till the last
			// node and then make the circular connection
			Node last = head;
			while (last.getNext() != head) {
				last = last.getNext();
			}
			last.setNext(newNode);
			head = newNode;
			return true;
		}
		// if the user has entered the position other than the first, so we have to
		// hold the node of the (position-1)th, i.e. the previous node's address
		Node previous = head;
		for (int i = 1; i < position - 1; i++) {
			previous = previous.getNext();
			// suppose now the previous is only head, so return false in that condition
			if (previous == head) {
				return false;
			}
		}
		// now if there is some node at (position-1)th index and that node is not the
		// head node also, so go ahead
		// first we have to make a link between the newNode and the node that is next to
		// the previous node
		newNode.setNext(previous.getNext());
		// now since the connection between the newnode and the the next part of the
		// newNode is set, so now we have to make the connection of the previous node's
		// next part to the newNode
		previous.setNext(newNode);
		return true;
	}

	// Business Logic to delete the given node by the data
	public boolean deleteByValue(int value) {
		// cheking if there is some node in the LL or not
		// i.e. if the head is null or not
		if (head == null) {
			return false;
		}
		// condition if the data that user entered is the data that is at the head node
		// only
		if (head.getData() == value) {
			// 2 conditions are there-->
			// 1. if there is only one node in the CLL
			if (head.getNext() == head) {
				head = null;
				return true;
			}
			// 2. if there are more than one node in the CLL
			Node last = head;
			while (last.getNext() != head) {
				last = last.getNext();
			}
			// firstly making the connection of the last node with the second node, i.e. the
			// node after the first or head node
			last.setNext(head.getNext());
			// making the head node as the node that is next to the head node previously
			head = head.getNext();
			return true;
		}
		// if the user has entered the value of the data that is not found at the head
		// node
		// to delete the node that is not the head node
		// get the address of that deletable node and also of the node that is previous
		// to that deletable node.
		Node previous = head;
		Node deletable = head;
		while (deletable.getData() != value) {
			previous = deletable;
			deletable = deletable.getNext();
			// check if the deletable node is head or not?
			if (deletable == head) {
				return false;
			}
		}
		// making a connection of the previous node to the deletable's next node, i.e.
		// forwarding the link
		previous.setNext(deletable.getNext());
		return true;
	}

	// Business Logic to delete the node by the position
	public boolean deleteByThePosition(int position) {
		// check whether the user has entered the -ve or zero position
		if (position <= 0) {
			return false;
		}
		// also check whether the CLL is empty or not
		if (head == null) {
			return false;
		}
		// if the position, that the user has entered is first or not
		if (position == 1) {
			// if there is only one node in the CLL
			if (head.getNext() == head) {
				head = null;
				return true;
			}
			// if there are more than one node in the CLL
			// so first locate the last node in the CLL
			Node last = head;
			while (last.getNext() != head) {
				last = last.getNext();
			}
			// now we have reached the last node, so make the connection of that last node
			// with the node that is next to the head node
			last.setNext(head.getNext());
			// making the connection of the head node to the node that is previously next to
			// the head node
			head = head.getNext();
			return true;
		}
		// if we have to delete the node that is not the first node
		// to do so, we have to take the address of the previous and the deletable's
		// address
		Node previous = head;
		Node deletable = head;
		// now locate the deletable now by going till the position
		for (int i = 1; i < position; i++) {
			previous = deletable;
			deletable = deletable.getNext();
			// check if the deletable node is head, then return false
			if (deletable == head) {
				return false;
			}
		}
		// now set the link of the previous's next node to the node which is next to the
		// deletable's node
		previous.setNext(deletable.getNext());
		return true;
	}

	// Business Logic to find the mid element in the CLL
	// but without any further boundary checking
	public void midElement() {
		int count = 0;
		Node temp = head;
		do {
			count++;
			temp = temp.getNext();
		} while (temp != head);
		int mid = (count / 2) + 1;
		Node midTemp = head;
		for (int i = 1; i < mid; i++) {
			midTemp = midTemp.getNext();
		}
		System.out.println(midTemp.getData() + " ");
	}
}
