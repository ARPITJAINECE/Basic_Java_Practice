package basic;

public class PalindromeNumber {

	public static void main(String[] args) {
		int x = 123;
		int orgX = x;
		int sum = 0;
//		int rev = 0;
		while (x > 0) {
			sum = sum * 10 + x % 10;
			x /= 10;
		}
		if (sum == orgX) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

}
