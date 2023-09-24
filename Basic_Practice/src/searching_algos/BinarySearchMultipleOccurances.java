package searching_algos;

import java.util.Arrays;

public class BinarySearchMultipleOccurances {
	public static boolean binarySearchMultipleOccrance(int[] arr, int key) {
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length - 1;
		boolean flag = false;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				System.out.println("element is found at position : " + mid);
				flag = true;
				int left = mid - 1;
				while (left >= 0 && arr[left] == key) {
					System.out.println("element is found at position : " + left);
					left--;
				}
				int right = mid + 1;
				while (right < arr.length && arr[right] == key) {
					System.out.println("element is found at position : " + right);
					right++;
				}
				return true;
			} else if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10 };
		int key = 7;
//		System.out.print(binarySearchMultipleOccrance(arr, key));
		binarySearchMultipleOccrance(arr, key);
	}

}
