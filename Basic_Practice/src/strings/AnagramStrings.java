package strings;

import java.util.Arrays;

public class AnagramStrings {
	public static boolean anagramOrNot(String first, String second) {
		first = first.toLowerCase();
		second = second.toLowerCase();
		char[] firstChar = first.toCharArray();
		char[] secondChar = second.toCharArray();
		Arrays.sort(firstChar);
		Arrays.sort(secondChar);
		if (firstChar.length != secondChar.length) {
			return false;
		}
		if (Arrays.equals(firstChar, secondChar)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String first = "RAce";
		String second = "CarE";
		System.out.println(anagramOrNot(first, second));
	}
}
