package basic;

import java.util.Arrays;

public class Anagram_2 {
	public static boolean ifAnagram(String testString1, String testString2) {
		String semiFinalString1 = testString1.toLowerCase();
		String semifinalString2 = testString2.toLowerCase();
		char[] semiFinalChar1 = semiFinalString1.toCharArray();
		char[] semiFinalChar2 = semifinalString2.toCharArray();
		Arrays.sort(semiFinalChar1);
		Arrays.sort(semiFinalChar2);
		if (semiFinalChar1.length != semiFinalChar2.length) {
			return false;
		} else {
			for (int i = 0; i < semiFinalChar1.length; i++) {
				if (semiFinalChar1[i] == semiFinalChar2[i]) {
					continue;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String testString1 = "race";
		String testString2 = "care";
		System.out.println(ifAnagram(testString1, testString2));
	}
}
