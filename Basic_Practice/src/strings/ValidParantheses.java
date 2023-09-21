//package strings;
//public class ValidParantheses {
//	public static boolean parantheseValid(String s) {
//		for (int i = 0; i < s.length(); i++) {
//			if ((s.charAt(i) == '(' && s.charAt(i + 1) == ')') || (s.charAt(i) == '{' && s.charAt(i + 1) == '}')
//					|| (s.charAt(i) == '[' && s.charAt(i + 1) == ']')) {
//				return true;
//			} else {
//				return false;
//			}
//		}
//		return true;
//	}
//	public static void main(String[] args) {
//		String s = "(){}[]";
//		System.out.println(parantheseValid(s));
//	}
//}
package strings;

import java.util.Stack;

public class ValidParantheses {
	public static boolean parantheseValid(String s) {
		Stack<Character> charStack = new Stack<Character>();
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '(')
				charStack.push(')');
			else if (ch[i] == '{')
				charStack.push('}');
			else if (ch[i] == '[')
				charStack.push(']');
			else if (charStack.isEmpty() || charStack.pop() != ch[i])
				return false;
		}
		return charStack.isEmpty();
	}

	public static void main(String[] args) {
		String s = "[{()}]";
		System.out.println(parantheseValid(s));
	}
}