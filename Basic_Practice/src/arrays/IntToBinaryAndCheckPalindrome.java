package arrays;

import java.util.Scanner;

public class IntToBinaryAndCheckPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integer value: ");
		int value = sc.nextInt();
		System.out.println("the binary of the above integer is : ");
		String convertedValue = Integer.toBinaryString(value);
		System.out.println(convertedValue);
		String palindReverse = "";
		for (int i = convertedValue.length() - 1; i >= 0; i--) {
			palindReverse += convertedValue.charAt(i);
		}
		if (convertedValue.equals(palindReverse)) {
			System.out.println("value is palindrome!!!");
		} else {
			System.out.println("value is not palindrome!!!");
		}
//		System.out.println("doing with StringBuilder");
//		StringBuilder sb = new StringBuilder();
//		char[] ch = convertedValue.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			sb.append(ch).reverse();
//		}
//		for (int i = 0; i < ch.length; i++) {
//			if (convertedValue.equals()) {
//				System.out.println("palindrome");
//			} else {
//				System.out.println("not palindrome");
//			}
//		}
		sc.close();
	}

}
