package arrays;

public class LeetCode_2772_OperationsToMakeAllArrayElementsZero {
	public static boolean checkarray(int[] nums, int k) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[i] -= 1;
				count++;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 2, 3, 1, 1, 0 };
		int k = 3;
	}
}
