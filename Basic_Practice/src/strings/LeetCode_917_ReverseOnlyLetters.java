package strings;

public class LeetCode_917_ReverseOnlyLetters {
	public static String reverseOnlyLetters(String s) {
		char[] ch = s.toCharArray();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (!((s.charAt(i) > 'a' && s.charAt(i) < 'z') || (s.charAt(i) > 'A' && s.charAt(i) < 'Z'))) {
				continue;
			}

		}
		return null;
	}

	public static void main(String[] args) {
		String s = "a-bC-dEf-ghIj";
	}
}
