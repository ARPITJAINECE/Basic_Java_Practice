//package basic;
//
//public class ReverseInteger {
//	public static int reverseInteger(int x) {
//		int rev = 0;
//		while (x != 0) {
//			int rem = x % 10;
//			if (rev > 2147483647 && rev < -2147483647)
//				return 0;
//			if (x < 0)
//				return (-1 * rev);
//			rev = rev * 10 + rem;
//			x = x / 10;
//		}
//		return rev;
//	}
//
//	public static void main(String[] args) {
//		int x = -123;
//		System.out.println(reverseInteger(x));
//	}
//
//}
package basic;

public class ReverseInteger {
	public static int reverseInteger(int x) {
		int rev = 0;
		while (x != 0) {
			int rem = x % 10;
			if (rev > 2147483647 / 10 || (rev == 2147483647 / 10))
				return 0;
			if (rev < -2147483647 / 10 || (rev == -2147483647 / 10))
				return 0;
			rev = rev * 10 + rem;
			x = x / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int x = -123;
		System.out.println(reverseInteger(x)); // Should correctly print -321
	}
}
