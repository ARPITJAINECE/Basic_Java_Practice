package dsa_CLL;

public class MainCLL {
	public static void main(String[] args) {
		CircularlyLinkedList cll = new CircularlyLinkedList();
		cll.insert(10);
		cll.insert(20);
		cll.insert(30);
		cll.insert(40);
		cll.insert(50);
		System.out.println("initial insertion: ");
		cll.displayTheNodesInTheCLL();
		System.out.println();
		System.out.println("now inserting the newNode at some specific position");
		cll.insertAtGivenPosition(05, 1);
		cll.displayTheNodesInTheCLL();
		System.out.println();
		cll.insertAtGivenPosition(25, 4);
		cll.displayTheNodesInTheCLL();
		System.out.println();
		cll.insertAtGivenPosition(60, 8);
		cll.displayTheNodesInTheCLL();
		System.out.println();
//		System.out.println("deleting the node by entering the value of that node: ");
//		cll.deleteByValue(05);
//		cll.displayTheNodesInTheCLL();
//		System.out.println();
//		cll.deleteByValue(60);
//		cll.displayTheNodesInTheCLL();
//		System.out.println();
//		cll.deleteByValue(25);
//		cll.displayTheNodesInTheCLL();
		System.out.println();
		System.out.println("deleting the node in the CLL by the position: ");
		cll.deleteByThePosition(1);
		cll.displayTheNodesInTheCLL();
		System.out.println();
		cll.deleteByThePosition(3);
		cll.displayTheNodesInTheCLL();
		System.out.println();
		cll.deleteByThePosition(6);
		cll.displayTheNodesInTheCLL();
		System.out.println();
		System.out.println("getting the middle element in the given CLL: ");
		cll.midElement();
	}
}
