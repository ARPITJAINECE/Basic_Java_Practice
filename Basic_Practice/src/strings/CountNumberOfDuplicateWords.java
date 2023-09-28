package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountNumberOfDuplicateWords {
	// hey java is the best language and is like java

	public static void main(String[] args) {
		findDupliacteWords("hey java is the best language and is like java");
	}

	public static void findDupliacteWords(String dupString) {
		String[] words = dupString.split(" ");
		Map<String, Integer> wordsCount = new HashMap<String, Integer>();
		for (String s1 : words) {
			if (wordsCount.containsKey(s1)) {
				wordsCount.put(s1.toLowerCase(), wordsCount.get(s1) + 1);
			} else {
				wordsCount.put(s1, 1);
			}
		}
		Set<String> wordsInString = wordsCount.keySet();
	}
}
