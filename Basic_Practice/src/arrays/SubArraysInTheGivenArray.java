package arrays;

public class SubArraysInTheGivenArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 1, 5 };
		int b[];
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				System.out.println(a[i + 1]);
			}
		}
	}

}
