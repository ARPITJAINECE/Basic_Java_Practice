package arrays;

public class LeetCode_MonotonicArray_896 {
	public static boolean isMonotonic(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < nums[i + 1]) {
				if (nums[i] + 1 == nums[i + 1] || nums[i] == nums[i + 1]) {
					return true;
				} else {
					return false;
				}
			} else if (nums[i] > nums[i + 1]) {
				if (nums[i] == nums[i + 1] + 1 || nums[i] == nums[i + 1]) {
					return true;
				} else {
					return false;
				}
			} else if (nums[i] == nums[i + 1]) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3 };
		System.out.println(isMonotonic(nums));
	}

}
