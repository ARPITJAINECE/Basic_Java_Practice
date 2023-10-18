package strings;

public class LeetCode_520_DetectCapital {
	public static boolean detectCapitalUse(String word) {
		/*
		 * All letters in this word are capitals, like "USA". All letters in this word
		 * are not capitals, like "leetcode". Only the first letter in this word is
		 * capital, like "Google".
		 */
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= 'A' && word.charAt(i) <= 'z') {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String word = "";
		System.out.println(detectCapitalUse(word));
	}
}
