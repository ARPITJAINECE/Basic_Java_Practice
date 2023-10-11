package arrays;

public class LeetCode_2535_DifferenceSum {
	public static int differenceOfSum(int[] nums) {
		int arraySum = 0;
		int elementSum = 0;
		for (int i = 0; i < nums.length; i++) {
			arraySum += nums[i];
			elementSum+=numberSum(nums[i]);
		}
		
		return Math.abs(arraySum - elementSum);
	}

	public static int numberSum(int a) {
		int sum = 0;
		while (a != 0) {
			sum = sum + a % 10;
			a /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 15, 6, 3 };
		System.out.println(differenceOfSum(nums));
	}
}
