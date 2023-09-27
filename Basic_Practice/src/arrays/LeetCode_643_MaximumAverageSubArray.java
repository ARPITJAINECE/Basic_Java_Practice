package arrays;

public class LeetCode_643_MaximumAverageSubArray {
	static double findMaxAverage(int[] nums, int k) {
		int windowOpening = 0;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (i >= k - 1) {
				max = Math.max(max, sum);
				sum -= nums[windowOpening++];
			}
		}
		return (double) max / k;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 0, 4, 3, 3 };
		int k = 1;
		System.out.println(findMaxAverage(nums, k));
	}
}
