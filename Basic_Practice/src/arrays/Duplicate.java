package arrays;

public class Duplicate {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2, 2, 2, 2, 7, 7, 6, 9 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
			while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
				i++;
			}
		}
	}

}
