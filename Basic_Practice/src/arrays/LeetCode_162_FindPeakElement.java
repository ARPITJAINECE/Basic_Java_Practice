package arrays;

import java.util.Arrays;

public class LeetCode_162_FindPeakElement {
	public static int findPeakElement(int[] nums) {
		int newNums[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			newNums[i] = nums[i];
		}
		Arrays.sort(newNums);
		int finalbiggest = 0;
		int biggest = newNums[newNums.length - 1];
		for (int i = 0; i < nums.length; i++) {
			if (biggest == nums[i]) {
				finalbiggest = i;
			}
		}
		return finalbiggest;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 1, 3, 5, 6, 4 };
		System.out.println(findPeakElement(nums));
	}
}
