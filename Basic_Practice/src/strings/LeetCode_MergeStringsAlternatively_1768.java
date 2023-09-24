package strings;

public class LeetCode_MergeStringsAlternatively_1768 {
	public static String mergeStrings(String word1, String word2) {
		int i = 0, j = 0;
		int len1 = word1.length(), len2 = word2.length();
		String result = "";
		while (i < len1 || j < len2) {
			if (i < len1) {
				result += word1.charAt(i);
				i++;
			}
			if (j < len2) {
				result += word2.charAt(j);
				j++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String word1 = "abc";
		String word2 = "pqr";
		System.out.println(mergeStrings(word1, word2)); // Output: "apbqcr"
	}
}
