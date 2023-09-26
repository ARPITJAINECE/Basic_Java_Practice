package strings;

public class LeetCode_FindTheDifference_389 {
	public static char findDiff(String s, String t) {
		char newChar = 0;
		for (char sChar : s.toCharArray()) {
			newChar ^= sChar;
		}
		for (char tChar : t.toCharArray()) {
			newChar ^= tChar;
		}
		return newChar;
	}

	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		System.out.println(findDiff(s, t));
	}

}
