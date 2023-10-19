package basic;

import java.util.Arrays;

public class EvenOddPlacesElementsInAnArray {
	public static void evenOddPlaces(int[] nums) {
		int pos = 0;
		int nums2[] = new int[nums.length];
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				nums2[pos] = nums[i];
				pos++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 != 0) {
				nums2[pos] = nums[i];
				pos++;
			}
		}
		System.out.println(Arrays.toString(nums2));
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		evenOddPlaces(nums);
	}
}
