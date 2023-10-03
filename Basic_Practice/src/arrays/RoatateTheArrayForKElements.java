package arrays;

import java.util.Arrays;

public class RoatateTheArrayForKElements {
	static void roatateArray(int[] a) {
		int temp = a[0];
		for (int i = 1; i < a.length; i++) {
			a[i - 1] = a[i];
		}
		a[a.length - 1] = temp;
	}

	static void rotate(int[] a, int k) {
		k %= a.length;
		if (k <= 0) {
			k = k + a.length;
		}
		for (int i = 1; i <= k; i++) {
			roatateArray(a);
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int k = 10;
		rotate(a, k);
		System.out.println(Arrays.toString(a));
	}
}
