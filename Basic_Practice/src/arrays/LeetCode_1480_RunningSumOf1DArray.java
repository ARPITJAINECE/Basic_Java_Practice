
package arrays;

import java.util.Arrays;

public class LeetCode_1480_RunningSumOf1DArray {
	public static int[] runningSum(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i != 0) {
				nums[i] = nums[i] + nums[i - 1];
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(runningSum(nums)));
	}
}
