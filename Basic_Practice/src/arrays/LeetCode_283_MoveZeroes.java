package arrays;

import java.util.Arrays;

public class LeetCode_283_MoveZeroes {
	public static void moveZeroes(int[] nums) {
//		int j = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[count++] = nums[i];
			}
		}
		for (int k = count; k < nums.length; k++) {
			nums[k] = 0;
		}
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		int nums[] = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
	}
}
