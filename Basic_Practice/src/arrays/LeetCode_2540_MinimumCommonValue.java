package arrays;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_2540_MinimumCommonValue {
	public static int getCommon(int[] nums1, int[] nums2) {
//		for (int i = 0; i < nums1.length; i++) {
//			for (int j = 0; j < nums2.length; j++) {
//				if (nums1[i] == nums2[j]) {
//					return nums1[i];
//				}
//			}
//		}
//		return -1;
		// use set for proper implementation of all the cases
		Set<Integer> set = new HashSet<>();
		for (int num : nums1) {
			set.add(num);
		}
		for (int num : nums2) {
			if (set.contains(num)) {
				return num;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int nums1[] = { 1, 2, 3 };
		int nums2[] = { 2, 3, 4 };
		System.out.println(getCommon(nums1, nums2));
	}
}
