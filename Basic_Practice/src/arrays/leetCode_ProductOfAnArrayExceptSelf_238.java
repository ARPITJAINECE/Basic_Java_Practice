package arrays;

import java.util.Arrays;

public class leetCode_ProductOfAnArrayExceptSelf_238 {

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] answer = new int[n];

		// Calculate the product of all elements to the left of each element
		int leftProduct = 1;
		for (int i = 0; i < n; i++) {
			answer[i] = leftProduct;
			leftProduct *= nums[i];
		}

		// Calculate the product of all elements to the right of each element and
		// multiply it with the left product
		int rightProduct = 1;
		for (int i = n - 1; i >= 0; i--) {
			answer[i] *= rightProduct;
			rightProduct *= nums[i];
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[] result = productExceptSelf(nums);
		System.out.println(Arrays.toString(result));
	}
}
