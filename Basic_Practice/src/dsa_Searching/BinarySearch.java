package dsa_Searching;

import java.util.Arrays;

public class BinarySearch {
	public static int binarySearchIndex(int[] a, int key) {
		Arrays.sort(a);
		// high, low and mid will be based on the index, not the value which is stored
		// at that index
		int high = a.length - 1;
		int low = 0;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid] == key) {
				return mid;
			} else if (key < a[mid]) {
				low = low;// just for understanding
				high = mid - 1;
			} else {
				high = high;// just for understanding
				low = mid + 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] a = { 8, 6, 4, 2, 9, 265, 47, 64, 6546, 516, 465, 46 };
		int key = 6546;
		System.out.println(binarySearchIndex(a, key) + "th index");
	}
}
