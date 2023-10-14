package strings;

import java.util.Arrays;

public class LeetCode_1929_ConcatenationOfArray {
	public static int[] getConcatenation(int[] nums) {
		int[] newNums = new int[2 * nums.length];
		for (int i = 0; i < nums.length; i++) {
			newNums[i] = nums[i];
			newNums[i + nums.length] = nums[i];
		}
		return newNums;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 1 };
		System.out.println(Arrays.toString(getConcatenation(nums)));
	}
}