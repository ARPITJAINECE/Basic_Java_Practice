package arrays;

public class FrequencyOfEachElementInGivenArray {
	public static int getMaxValue(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
		// finding the max element
		int max = getMaxValue(array);
		int freq[] = new int[max + 1];
		for (int i = 0; i < array.length; i++) {
			freq[array[i]]++;
		}
		// printing the output
		for (int i = 0; i <= max; i++) { // Iterate up to 'max'
			if (freq[i] > 0) {
				System.out.println(i + " occurs " + freq[i] + " times....");
			}
		}
	}
}
