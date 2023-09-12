//package arrays;
//
//public class MissingNumber {
//
//	public static void main(String[] args) {
//		int[] arr = { 2, 4, 10 };
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if ((arr[j] != arr[i] + 2)) {
////					return;
//					break;
//				} else {
//					System.out.println(arr[j] + 2);
//				}
//			}
//		}
//	}
//}
//package arrays;
//
//public class MissingNumber {
//
//	public static void main(String[] args) {
//		int[] arr = { 1, 2, 4, 5, 7 };
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i + 1] != arr[i] + 1) {
//				System.out.println(arr[i] + 1); // Print the missing number
//				return;
//			}
//		}
//	}
//
//}
package arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 10 };
//		int[] brr = new int[10];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] == arr[i] + 2) {
				System.out.println(arr[i] + 2);
			}
		}
	}
}
