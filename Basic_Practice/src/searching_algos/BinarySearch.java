package searching_algos;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 7, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 8, 9 };
		int key = 7;
		Arrays.sort(arr);
		System.out.println("array after sorting is :");
		System.out.println(Arrays.toString(arr));
		System.out.println("finding the key element/s in my array: ");
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == key) {
				System.out.println("element is found at " + mid + " position...");
				return;
			}
			if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
	}

}
