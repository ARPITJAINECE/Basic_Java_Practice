package arrays;

public class FindWhetherArrayIsSortedOrNot {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 6, 5 };
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] < 0) {
				count++;
			}
		}
		if (count != 0) {
			System.out.println("Unsorted");
		} else {
			System.out.println("Sorted");
		}
	}

}
