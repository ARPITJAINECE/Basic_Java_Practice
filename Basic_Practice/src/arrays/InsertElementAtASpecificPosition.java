package arrays;

public class InsertElementAtASpecificPosition {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 6, 7, 8, 9, 10, 11 };
		int size = a.length;
		int b[] = new int[size + 1];
		int loc = 7;
		int newNumber = 15;
		for (int i = 0; i < loc; i++) {
			b[i] = a[i];
		}
//		for (int i = size; i > loc; i--) {
//			b[i] = a[i - 1];
//		}
		for (int i = loc; i <= size - 1; i++) {
			b[i + 1] = a[i];
		}
		b[loc] = newNumber;
		size++;
		for (int i = 0; i < size; i++) {
			System.out.println(b[i]);
		}
	}
}