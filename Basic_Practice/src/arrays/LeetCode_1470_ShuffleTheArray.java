package arrays;

public class LeetCode_1470_ShuffleTheArray {
	static int[] shuffleArray(int[] nums, int n) {
		int[] newArray = new int[nums.length];
		for (int i = 0; i < nums.length / 2; i++) {
			newArray[2 * i] = nums[i];
			newArray[2 * i + 1] = nums[i + n];
		}
		return newArray;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 5, 1, 3, 4, 7 };
		int n = 3;
		for (int a : shuffleArray(nums, n)) {
			System.out.println(a + " ");
		}
	}
}
