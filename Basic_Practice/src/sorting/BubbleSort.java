package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 10, 9, 8, 7, 6, 5, 8, 4, 3, 2, 1, 0 };
		int passes = arr.length - 1;
		int comps = arr.length - 1;
		for (int i = 0; i < passes; i++) {
			for (int j = 0; j < comps - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
