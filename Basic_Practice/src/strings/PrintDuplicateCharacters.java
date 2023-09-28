package strings;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharacters {
	public static void main(String[] args) {
		String s = "java";// a-->2 times //ex: Naveen----->o/p---->only e(2times)
		if (s == null) {
			return;
		}
		if (s.isEmpty()) {
			System.out.println("string is empty");
			return;
		}
		if (s.length() == 1) {
			System.out.println("single char string");
			return;
		}
		char[] charArray = s.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (char c : charArray) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
	}
}
