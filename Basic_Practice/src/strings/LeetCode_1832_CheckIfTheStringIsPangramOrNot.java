package strings;

import java.util.HashMap;

public class LeetCode_1832_CheckIfTheStringIsPangramOrNot {
	public static boolean checkIfPangram(String sentence) {
//		char[] ch = sentence.toCharArray();
//		Arrays.sort(ch);
//		String.valueOf(ch);
//		for (int i = 0; i < sentence.length(); i++) {
//			if (sentence.matches("[a-zA-Z]+")) {
//				return true;
//			}
//		}
//		return false;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < sentence.length(); i++) {
			map.put(sentence.charAt(i), i);
		}
		if (map.size() == 26) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(sentence));
	}
}
