package dsa_DLL;

public class MainDLL {
	public static void main(String[] args) {
		DoublyLL dll = new DoublyLL();
		dll.insert(10);
		dll.insert(20);
		dll.insert(30);
		dll.insert(40);
		dll.insert(50);
		dll.displayTheDLL();
		System.out.println("entering the new node at given location of the given data: ");
		dll.insertAtGivenPosition(60, 6);
		dll.insertAtGivenPosition(15, 2);
		dll.insertAtGivenPosition(05, 1);
		dll.displayTheDLL();
		System.out.println("deleting the node in the DLL by the value at: ");
		dll.deleteByValue(60);
		dll.deleteByValue(15);
		dll.deleteByValue(05);
		dll.displayTheDLL();
		System.out.println("deleting the node in the DLL by the position : ");
		dll.deleteByPosition(1);
		dll.deleteByPosition(2);
		dll.deleteByPosition(3);
		dll.displayTheDLL();
	}
}
