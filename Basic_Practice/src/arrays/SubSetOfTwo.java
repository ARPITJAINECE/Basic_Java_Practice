package arrays;

public class SubSetOfTwo {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int num = 7;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == num) {
					System.out.println("( " + arr[i] + " , " + arr[j] + " )");
				}
			}
		}
	}
}