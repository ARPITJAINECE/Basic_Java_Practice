package basic;

public class MissingAndDuplicates {
	public static void findingMissingAndDuplicates(int arr[]) {
		int missing = 0;
		int duplicate = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				duplicate = arr[i];
			} else if (arr[i] + 1 != arr[i + 1]) {
				missing = arr[i] + 1;
			}
		}
		System.out.println("missing is : " + missing + " and duplicate is : " + duplicate);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4, 6, 7, 8, 9 };
		findingMissingAndDuplicates(arr);
	}
}