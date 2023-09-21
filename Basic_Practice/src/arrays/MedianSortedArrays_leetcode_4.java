package arrays;

import java.util.Arrays;

public class MedianSortedArrays_leetcode_4 {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int finalArray[] = new int[nums1.length + nums2.length];
		for (int i = 0; i < nums1.length; i++) {
			finalArray[i] = nums1[i];
		}
		for (int i = 0; i < nums2.length; i++) {
			finalArray[nums1.length + i] = nums2[i];
		}
		Arrays.sort(finalArray);
		if (finalArray.length % 2 == 0) {
			return (double) (finalArray[finalArray.length / 2 - 1] + finalArray[finalArray.length / 2]) / 2;
		} else {
			return (double) finalArray[finalArray.length / 2];
		}
	}

	public static void main(String[] args) {
		int nums1[] = { 1, 3 };
		int nums2[] = { 2, 4 };
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
}
