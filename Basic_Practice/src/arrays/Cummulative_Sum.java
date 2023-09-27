package arrays;

public class Cummulative_Sum {
	public static int[] getCumulativeSum(int[] arr) {
		int[] sum = new int[arr.length];
		sum[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			sum[i] = sum[i - 1] + arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(getCumulativeSum(arr));
	}
}
