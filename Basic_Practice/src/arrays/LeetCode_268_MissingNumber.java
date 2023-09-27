package arrays;

public class LeetCode_268_MissingNumber {
	static int missingNumber(int[] nums) {
		int n = nums.length;
		int totalSum = n * (n + 1) / 2;
		int sum = 0;
		for (int i = 0; i < n - 1; i++) {
			sum = sum + nums[i];
		}
		return totalSum - sum;
	}

	public static void main(String[] args) {
		int nums[] = { 0 };
		System.out.println(missingNumber(nums));
	}
}
