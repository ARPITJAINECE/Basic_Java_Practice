package strings;

public class LeetCode_2108_FirstPalindromicStringInTheArray {
	public static String firstPalindrome(String[] words) {
		for (int i = 0; i < words.length; i++) {
			if (isPalindrome(words[i])) {
				return words[i];
			}
		}
		return "";
	}

	public static boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String newS = sb.toString();
		if (newS.equals(s))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String words[] = { "abc", "car", "ada", "racecar", "cool", "bcdcb" };
		System.out.println(firstPalindrome(words));
	}
}
