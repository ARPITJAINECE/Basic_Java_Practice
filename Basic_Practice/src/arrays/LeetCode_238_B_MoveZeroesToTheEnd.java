package arrays;

import java.util.Arrays;

public class LeetCode_238_B_MoveZeroesToTheEnd {
	public static void moveZeroes(int[] nums) {
		int pos = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[pos++] = nums[i];
			}
		}
		for (int k = pos; k < nums.length; k++) {
			nums[k] = 0;
		}
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		int[] nums = { 12, 52, 89, 2, 6, 4, 8, 0, 0, 0, 1, 5, 21, 54, 1616, 0, 0, 0 };
		moveZeroes(nums);
	}
}
