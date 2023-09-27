package arrays;

public class LeetCode_1588_SumOfAllOddLengthSubArrays {
	static int sumOfOdd(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int oddSum = 0;
				for (int k = i; k <= j; k++) {
					oddSum += arr[k];
				}
				if ((j - i + 1) % 2 == 1) {
					sum += oddSum;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, 5, 3 };
		System.out.println(sumOfOdd(arr));
	}
}
