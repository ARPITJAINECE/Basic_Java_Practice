package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode_217_ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] == nums[j]) {
//					return true;
//				}
//			}
//		}
//		Arrays.sort(nums);
//		for (int i = 0; i < nums.length - 1; i++) {
//			if (nums[i] == nums[i+1]) {
//				return true;
//			}
//		}
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			if (!set.add(num)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		System.out.println(containsDuplicate(nums));
	}
}
