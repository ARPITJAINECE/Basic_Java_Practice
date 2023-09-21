//package arrays;
//
//public class CompareTheTriplets {
//
//	public static void main(String[] args) {
//		int[] a = { 17, 28, 30 };
//		int[] b = { 99, 16, 8 };
//		int alice = 0;
//		int bob = 0;
//
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] > b[i]) {
//				alice++;
//			} else if (a[i] < b[i]) {
//				bob++;
//			}
//		}
//
//		System.out.println(alice + " " + bob);
//	}
//}
package arrays;

import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {
//		int[] a = { 17, 28, 30 };
		int[] a = new int[3];
//		int[] b = { 99, 16, 8 };
		int[] b = new int[3];
		int alice = 0;
		int bob = 0;
		System.out.println("enter the array a: ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter the array b: ");
//		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < b.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > b[i]) {
				alice++;
			} else if (a[i] < b[i]) {
				bob++;
			}
		}

		System.out.println(alice + " " + bob);
	}
}
