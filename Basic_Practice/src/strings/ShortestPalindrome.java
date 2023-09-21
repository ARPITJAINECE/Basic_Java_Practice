package strings;

public class ShortestPalindrome {
	static String shortestPalindrome(String s) {
		int n = s.length();
		StringBuilder sb = new StringBuilder();
		sb.append(s).reverse();
		for (int i = 0; i < n; i++) {
			if (s.substring(0, n - i).equals(sb.substring(i))) {
				return sb.substring(0, i) + s;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		String s = "abcd";
		System.out.println(shortestPalindrome(s));
	}
}
