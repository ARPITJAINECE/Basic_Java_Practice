package dsa_own;

public class AddTwoNumbersLeetCode {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = l1;
//		ListNode head = l1;

		// head.display();
		int num = 0;
		while (head != null) {
			num = num * 10 + head.val;
			System.out.println(head.val);
			head = head.next;
		}
		System.out.println(num);

		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode ll = new ListNode();
		ll.insert(2);
		ll.insert(4);
		ll.insert(3);

		ListNode l2 = new ListNode();
		l2.insert(5);
		l2.insert(6);
		l2.insert(4);
		ll.display();
		// ll.display();s
		l2.display();

		AddTwoNumbersLeetCode llsum = new AddTwoNumbersLeetCode();
		ListNode head = llsum.addTwoNumbers(ll, l2);
		head.display();

	}

}