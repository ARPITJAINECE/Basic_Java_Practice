package arrays;

import java.util.Arrays;

public class LeetCode_88_MergeSortedArray {
	public static void merge(int[] num1, int[] num2, int n, int m) {
		for (int i = 0; i < m + n; i++) {
			num1[i + n] = num2[i];
		}
		System.out.println(Arrays.toString(num1));
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 4, 5, 6 };
		int n = 3;
		int m = 3;
		merge(nums1, nums2, n, m);
	}
}
