package strings;

import java.util.Arrays;

public class LeetCode_242_ValidAnagram {
	public static boolean isAnagram(String s, String t) {
		if (s.length() == t.length()) {
			char[] ch1 = s.toCharArray();
			char[] ch2 = t.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAnagram(s, t));
	}
}
