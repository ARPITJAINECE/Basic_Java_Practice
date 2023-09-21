package arrays;

public class RemoveDuplicatesFromSortedArrayAgain {
	public static void main(String[] args) {
		int[] nums = { 2, 2, 3, 3, 4, 6, 6, 7, 8, 9 };
		int rd = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[rd] != nums[i]) {
				rd++;
				nums[rd] = nums[i];
			}
		}
		for (int i = 0; i < rd + 1; i++) {
			System.out.println(nums[i]);
		}
	}
}
