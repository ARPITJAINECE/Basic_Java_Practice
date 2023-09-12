package dsa;

import java.util.Set;

public class UnionOfTwoArrays {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 1, 2, 3 };
//		int max1 = a1.length;
//		int max2 = a2.length;
//		if()
//		for (int i = 0; i < a1.length; i++) {
//			for (int j = 0; j < a2.length; j++) {
//				if (a1[i] == a2[j]) {
//					System.out.print(a1[i]);
//				} else {
//					System.out.println(a1[i]);
////					System.out.println(a2[j]);
//				}
//			}
//		}
		// 1,2,3
		// 4,5,6
		int len = a1.length + a2.length;
		int c[] = new int[len];

		for (int i = 0; i < a1.length; i++) {
			c[i] = a1[i];

		}
		for (int i = 0; i < a2.length; i++) {
			c[i + a1.length] = a2[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
