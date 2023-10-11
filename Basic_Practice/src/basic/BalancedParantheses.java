package basic;

import java.util.Stack;

public class BalancedParantheses {
	public static boolean isBalanced(String paran) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : paran.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String paran = "((()))";
		System.out.println(isBalanced(paran));
	}
}
