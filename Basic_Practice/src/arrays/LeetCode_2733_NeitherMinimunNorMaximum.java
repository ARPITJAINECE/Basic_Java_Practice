package arrays;

import java.util.Arrays;

public class LeetCode_2733_NeitherMinimunNorMaximum {
	public static int findNonMinOrMax(int[] nums) {
		Arrays.sort(nums);
		if (nums.length == 2 || nums.length == 0 || nums.length == 1)
			return -1;
		else
			return nums[1];
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1, 4 };
		System.out.println(findNonMinOrMax(nums));
	}
}
