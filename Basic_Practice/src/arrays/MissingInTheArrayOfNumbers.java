package arrays;

import java.util.Arrays;

public class MissingInTheArrayOfNumbers {

	public static void main(String[] args) {
		int[] arr = { 0, 3, 4, 8, 7, 6, 1 };
		Arrays.sort(arr);// 0123 678
		System.out.println("array after sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("missing");
		for (int i = 0; i < arr[arr.length - 1] - 1; i++) {
			if (arr[i + 1] != arr[i] + 1) {
				System.out.println(arr[i] + 1);
			}
		}
	}
}