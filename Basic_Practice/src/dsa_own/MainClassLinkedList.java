package dsa_own;

public class MainClassLinkedList {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);
		l.displayTheElements();
		System.out.println("displaying the LL in the reverse order: ");
		l.displayTheLLReverse();
		System.out.println("after adding a new node at a given position");
		l.insertAtPosition(60, 6);
		l.displayTheElements();
		l.insertAtPosition(25, 3);
		l.displayTheElements();
		System.out.println("deleting the node of value = 25: ");
		l.deleteByValue(25);
		l.displayTheElements();
		System.out.println("deleting the node by the position: ");
		l.deleteByPosition(1);
		l.displayTheElements();
	}
}
