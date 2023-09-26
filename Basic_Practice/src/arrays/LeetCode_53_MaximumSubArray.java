package arrays;

public class LeetCode_53_MaximumSubArray {
	public static int maxSubArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					System.out.print(nums[k] + " ");
					sum += nums[k];

//					System.out.print(nums[k] + " " + "and sum is : " + sum);
//					return nums[k];
				}
				System.out.print("sum is : " + sum);
				System.out.println();
			}
		}
//		return 0;
		return 0;
	}

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));
	}
}
