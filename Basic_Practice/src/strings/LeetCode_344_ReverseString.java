package strings;

public class LeetCode_344_ReverseString {
	public static void reverseString(char[] s) {
		for (int i = s.length - 1; i >= 0; i--) {
			System.out.print(s[i]);
		}
	}

	public static void main(String[] args) {
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		reverseString(s);
	}
}
