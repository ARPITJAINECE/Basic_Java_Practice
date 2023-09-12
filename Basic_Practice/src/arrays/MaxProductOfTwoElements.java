package arrays;

public class MaxProductOfTwoElements {

	public static void main(String[] args) {
		int[] array = { 2, 3, 5, 7, -7, 5, 8, -5 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int temp = 0;
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("max 2 numbers are : " + array[array.length - 1] + " and " + array[array.length - 2]);
		int mul = array[array.length - 1] * array[array.length - 2];
		System.out.println("max multiplication is: " + mul);
	}
}