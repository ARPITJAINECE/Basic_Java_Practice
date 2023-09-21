package arrays;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int brr[] = { 1, 2, 3, 4, 5, 6 };
		int count = 0;
		if (arr.length == brr.length) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == brr[i]) {
					count = 1;
				} else {
					count = 0;
				}
			}
		} else {
			System.out.println("length of both of the arrays are not equal!!!!!");
			System.exit(0);
		}
		if (count == 1) {
			System.out.println("both arrays are equals");
		} else {
			System.out.println("both arrays are not equals");
		}
	}

}
