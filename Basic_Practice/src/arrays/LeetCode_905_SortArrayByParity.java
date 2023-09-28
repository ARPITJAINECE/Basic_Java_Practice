package arrays;

import java.util.Arrays;

public class LeetCode_905_SortArrayByParity {
	public static int[] sortArrayByParity(int[] nums) {
		int even = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				int temp = nums[i];
				nums[i] = nums[even];
				nums[even++] = temp;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int nums[] = { 3, 1, 2, 4 };
		System.out.println(sortArrayByParity(nums));
		System.out.println(Arrays.toString(nums));
	}
}
