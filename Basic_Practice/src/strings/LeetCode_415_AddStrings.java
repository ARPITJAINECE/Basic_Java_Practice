package strings;

import java.math.BigInteger;

public class LeetCode_415_AddStrings {
	public static String addStrings(String num1, String num2) {
//		int output = Integer.parseInt(num1) + Integer.parseInt(num2);
//		return Integer.toString(output);
		BigInteger first = new BigInteger(num1);
		BigInteger second = new BigInteger(num2);
		BigInteger add = first.add(second);
		return add.toString();
	}

	public static void main(String[] args) {
		String num1 = "123";
		String num2 = "11";
		System.out.println(addStrings(num1, num2));
	}
}
