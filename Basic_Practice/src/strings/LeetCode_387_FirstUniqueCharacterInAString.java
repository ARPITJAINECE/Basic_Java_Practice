package strings;

public class LeetCode_387_FirstUniqueCharacterInAString {
	static int firstUniqChar(String s) {
		int[] freq = new int[256];
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char newCh = s.charAt(i);
			freq[newCh]++;
		}
		for (int i = 0; i < ch.length; i++) {
			char newCh = s.charAt(i);
			if (freq[newCh] == 1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String s = "loveleetcode";
		System.out.println(firstUniqChar(s));
	}
}
