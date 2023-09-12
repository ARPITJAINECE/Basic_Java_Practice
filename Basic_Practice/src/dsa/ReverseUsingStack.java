package dsa;

import java.util.Stack;

public class ReverseUsingStack {

	public static void main(String[] args) {
		String s = "love";
		char[] ch = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < ch.length; i++) {
			stack.push(ch[i]);
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.println(stack.pop());
		}
	}
}