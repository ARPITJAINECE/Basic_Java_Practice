package map;

import java.util.HashMap;
import java.util.Map;

public class ElementOccuranceExample {
	private static Map<Character, Integer> countingOccuranceOfElements(String input) {
		Map<Character, Integer> occuranceMap = new HashMap<Character, Integer>();
		for (char c : input.toCharArray()) {
			occuranceMap.put(c, occuranceMap.getOrDefault(c, 0) + 1);
		}
		return occuranceMap;
	}

	public static void main(String[] args) {
		String input1 = "my name is Arpit Jain";
		String input = input1.replaceAll(" ", "").toLowerCase();
		Map<Character, Integer> occuranceMap = countingOccuranceOfElements(input);
		System.out.println("elements occurances are: ");
		for (Map.Entry<Character, Integer> entry : occuranceMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
