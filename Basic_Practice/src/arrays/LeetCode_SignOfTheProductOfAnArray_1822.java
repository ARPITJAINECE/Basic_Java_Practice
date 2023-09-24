package arrays;

public class LeetCode_SignOfTheProductOfAnArray_1822 {
	public static int signOfProduct(int[] nums) {
		int product = 1;
		for (int i = 0; i < nums.length; i++) {
			product = product * nums[i];
		}
		if (product > 0) {
			return 1;
		} else if (product < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		int nums[] = { -1, 1, -1, 1, -1 };
		System.out.println(signOfProduct(nums));
	}

}
