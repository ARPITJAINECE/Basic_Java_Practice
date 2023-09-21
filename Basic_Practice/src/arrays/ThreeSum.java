package arrays;

public class ThreeSum {
	public static void printSubsets(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int sum = nums[i] + nums[k] + nums[j];
					if ((nums[i] == nums[j]) || (nums[j] == nums[k]) || (nums[i] == nums[k])) {
						if (sum == 0) {
							System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4, -2 };
		int count = 2;

		if (!(nums.length < count)) {
			printSubsets(nums);
		}
	}
}
