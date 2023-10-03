package dsa_Stack;

public class MainStack {
	public static void main(String[] args) {
		StackOperations s = new StackOperations(5);
		System.out.println(s.push(10));
		System.out.println(s.push(20));
		System.out.println(s.push(30));
		System.out.println(s.push(40));
		System.out.println(s.push(50));
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
		System.out.println(s.peek());
	}
}
