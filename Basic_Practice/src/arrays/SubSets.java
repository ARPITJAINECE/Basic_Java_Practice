
package arrays;

import java.util.Arrays;

public class SubSets {

	public static void main(String[] args) {
		int[] arr = { 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 109 };
		System.out.println("making the subsets if the sum is greater than 108");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum >= 108) {
					int subArr[] = Arrays.copyOfRange(arr, i, j + 1);
					System.out.print(Arrays.toString(subArr));
				}
			}
			System.out.println();
		}
	}

}
