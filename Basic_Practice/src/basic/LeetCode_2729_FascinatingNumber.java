package basic;

import java.util.HashSet;

public class LeetCode_2729_FascinatingNumber {
	public static boolean isFascinating(int n) {
		int doubleN = 2 * n;
		int tripleN = 3 * n;
		String concatenated = n + "" + doubleN + tripleN;
		HashSet<Character> set = new HashSet<>();
		for (char c : concatenated.toCharArray()) {
			if (c >= '1' && c <= '9') {
				if (!set.add(c)) {
					return false;
				}
			}
		}

		return set.size() == 9;
	}

	public static void main(String[] args) {
		int n = 798;
		System.out.println(isFascinating(n));
	}
}
