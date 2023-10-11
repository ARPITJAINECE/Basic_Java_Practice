package arrays;

import java.util.Arrays;

public class LeetCode_2529_MaximumCountOfPositiveAndNegativeIntegers {
	public static int maximumCount(int[] nums) {
		Arrays.sort(nums);
		int positiveCount = 0;
		int negativeCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				negativeCount++;
			} else if (nums[i] > 0) {
				positiveCount++;
			}
		}
		return Math.max(negativeCount, positiveCount);
	}

	public static void main(String[] args) {
		int nums[] = { 5, 20, 66, 1314 };
		System.out.println(maximumCount(nums));
	}
}
