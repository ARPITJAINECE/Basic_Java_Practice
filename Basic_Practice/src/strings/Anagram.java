package strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a = "abcd";
		String b = "cdbam";
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();

		// 1st method---using arrays equals method
		Arrays.sort(a1);
		Arrays.sort(b1);
		System.out.println(Arrays.equals(a1, b1));

		// 2nd method-- using ASCII value's sum method
		int s1 = 0;
		int s2 = 0;
		for (int i = 0; i < a1.length; i++) {
			s1 += (int) a1[i];
		}
		for (int i = 0; i < b1.length; i++) {
			s1 += (int) b1[i];
		}
		if (s1 == s2) {
			System.out.println("ANAGRAM");
		} else {
			System.out.println("NOT ANAGRAM");
		}
	}

}
