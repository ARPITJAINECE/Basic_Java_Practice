package dsa_own;

public class MainClassOfLinkedList {

	public static void main(String[] args) {
		LinkedList linkedList1 = new LinkedList();
		linkedList1.insertInLinkedList(1);
		linkedList1.insertInLinkedList(2);
		linkedList1.insertInLinkedList(3);
		linkedList1.insertInLinkedList(4);
		linkedList1.displayTheContenoOfTheLinkedList();
		System.out.println("new linked list");
		LinkedList linkedList2 = new LinkedList();
		linkedList2.insertInLinkedList(1);
		linkedList2.insertInLinkedList(2);
		linkedList2.insertInLinkedList(3);
		linkedList2.insertInLinkedList(4);
		linkedList2.displayTheContenoOfTheLinkedList();
		System.out.println("adding the two linked lists: ");
//		System.out.println("value of l1 linked list is : "+linkedList1.);
		LinkedList dummyHead = new LinkedList(0);
		LinkedList current = dummyHead;
		while (linkedList1 != null || linkedList2 != null) {
			int x = linkedList1.val;
			int y = linkedList2.val;
			int sum = x + y;
//			current. = new Node_linkedList(sum % 10);
		}
	}

}
