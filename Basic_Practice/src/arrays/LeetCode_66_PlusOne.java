package arrays;

import java.util.Arrays;

public class LeetCode_66_PlusOne {
	public static int[] plusOne(int[] digits) {
		int n = digits.length;

		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		int[] result = new int[n + 1];
		result[0] = 1;

		return result;
	}

	public static void main(String[] args) {
		int digits[] = { 1, 2, 9 };
		plusOne(digits);
		System.out.println(Arrays.toString(digits));
	}
}
