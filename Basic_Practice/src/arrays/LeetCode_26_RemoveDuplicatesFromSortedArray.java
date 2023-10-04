package arrays;

public class LeetCode_26_RemoveDuplicatesFromSortedArray {
	public static void removeDuplicates(int[] nums) {
		int rd = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[rd] != nums[i]) {
				rd++;
				nums[rd] = nums[i];
			}
		}
		for (int i = 0; i <= rd; i++) {
			System.out.println(nums[i] + " ");
		}
	}

	public static void main(String[] args) {
		int nums[] = { 2, 2, 3, 3, 4, 5, 5, 6, 6 };
		removeDuplicates(nums);
	}
}