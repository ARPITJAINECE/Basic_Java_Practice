package basic;

public class NinesIn1To100 {
	public static void main(String[] args) {
//		int find = 9;
		int start = 1;
		int end = 100;
		int count = 0;

		for (int i = start; i <= end; i++) {
			// Convert the number to a string to check each digit
			String numberAsString = Integer.toString(i);

			// Iterate through the digits of the number
			for (int j = 0; j < numberAsString.length(); j++) {
				if (numberAsString.charAt(j) == '9') {
					count++;
				}
			}
		}

		System.out.println("Total number of 9s in the range of " + start + " to " + end + ": " + count);
	}
}