package arrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_2828_AcronymString {
	public static boolean isAcronym(List<String> words, String s) {
		String[] word = words.toArray(new String[0]);
		StringBuilder sb = new StringBuilder();
		for (String ss : word) {
			if (!ss.isEmpty()) {
				sb.append(ss.charAt(0));
			}
		}
		return sb.toString().equals(s);
	}

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		words.add("alice");
		words.add("bob");
		words.add("charlie");
		String s = "abc";
		System.out.println(isAcronym(words, s));
	}
}
