package arrays;

import java.util.Arrays;

public class ShiftZeroesToLeft {
	public static int[] zeroToLeft(int[] nums) {
		int left = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {// for right shift ------> if (nums[i] != 0) {
				int temp = nums[i];
				nums[i] = nums[left];
				nums[left] = temp;
				left++;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 0, 2, 0, 3, 0, 0, 0, 0, 0 };
		zeroToLeft(nums);
		System.out.println(Arrays.toString(nums));
	}
}
