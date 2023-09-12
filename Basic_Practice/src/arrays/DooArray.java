package arrays;

public class DooArray {

	public static void main(String[] args) {
		int[] a = { 1, 3, 3, 4, 5 };
		int[] b = { 5, 7, 8, 9 };
		int[] c = new int[a.length * b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < b.length; j++) {
				int x = a[i] + b[i];
				if ((x) % 2 != 0) {
					c[i] = a[i] + b[i];
				} else if (x % 2 == 0) {
					c[i] = -1;
					break;
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i] + " at " + i);
		}
	}

}
