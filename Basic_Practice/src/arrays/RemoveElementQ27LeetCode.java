package arrays;

import java.util.Arrays;

public class RemoveElementQ27LeetCode {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 4, 2, 3 };
		int val = 3;
		int newElement = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[newElement++] = nums[i];
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}
