package arrays;

import java.util.Arrays;

public class LeetCode_41_FirstMissingPositive {
	public static int firstMissingPositive(int[] nums) {
		int missing = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= 0) {
				if (nums[i] != nums[i] + 1) {
					missing = nums[i] + 1;
					break;
				} else {
					missing = nums[i] + 1;
				}
			}
		}
		return missing;
	}

	public static void main(String[] args) {
		int nums[] = { 3, 4, -1, 1, 2 };
		System.out.println(firstMissingPositive(nums));
	}
}
