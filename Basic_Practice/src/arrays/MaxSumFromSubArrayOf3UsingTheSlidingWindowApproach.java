package arrays;

public class MaxSumFromSubArrayOf3UsingTheSlidingWindowApproach {
	static int MaxSumFromSubArrayof3Windows(int[] nums, int k) {
		int windowSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < k; i++) {
			windowSum += nums[i];
		}
		for (int i = k; i < nums.length; i++) {
			windowSum = windowSum - nums[i - k] + nums[i];
			maxSum = Math.max(maxSum, windowSum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int nums[] = { 2, 9, 31, -4, 21, 7 };
		int k = 3;
		System.out.println(MaxSumFromSubArrayof3Windows(nums, k));
	}

}
