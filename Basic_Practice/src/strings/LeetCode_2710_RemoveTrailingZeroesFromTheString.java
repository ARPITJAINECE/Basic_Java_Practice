package strings;

public class LeetCode_2710_RemoveTrailingZeroesFromTheString {
	public static String removeTrailingZeroes(String num) {
		int i = num.length() - 1;
		while (num.charAt(i) == '0') {
			(i)--;
		}
		return num.substring(0, i + 1);
	}

	public static void main(String[] args) {
		String num = "51230100";
		System.out.println(removeTrailingZeroes(num));
	}
}
