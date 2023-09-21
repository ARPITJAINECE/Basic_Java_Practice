package arrays;

import java.util.Arrays;

public class MajorityElementQ169LeetCode {

	public static void main(String[] args) {
		int nums[] = { 2, 2, 1, 2, 2, 1, 1, 1, 3, 1 };
		Arrays.sort(nums);
		int len = nums.length;
		int majority = len / 2;
		System.out.println(nums[majority]);
	}
}