package algorithms;

public class Kadane_finding_max_sum_in_subarray {
	public static int maxSubArray(int[] a) {
		int maxSum = a[0];
		int sum = a[0];
		for (int i = 1; i < a.length; i++) {
			if (sum > 0) {
				sum += a[i];
			} else {
				sum = a[i];
			}
			maxSum = Math.max(maxSum, sum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] a = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(a));
	}
}
