package sortingAlgos;

import java.util.Arrays;

public class MergeSort {
	public static void heapSort(int[] arr, int len) {
		if (len <= 1)
			return;
		for (int i = len - 1; i > 0; i--) {
			if (arr[i] > arr[(i - 1) / 2]) {
				int temp = arr[i];
				arr[i] = arr[(i - 1) / 2];
				arr[(i - 1) / 2] = temp;
			}
		}
		int temp = arr[0];
		arr[0] = arr[len - 1];
		arr[len - 1] = temp;
		heapSort(arr, len - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0, 0, 0, 0 };
		int len = arr.length;
		heapSort(arr, len);
		System.out.println(Arrays.toString(arr));
	}
}
