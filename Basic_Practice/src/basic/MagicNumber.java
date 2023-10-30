package basic;

public class MagicNumber {
	public static int magicNumber(int[] arr, int N) {
		int sum = 0, prod = 1, count = 0;

		for (int n : arr) {

			sum = 0;
			prod = 1;
//			for (int i = n; i != 0; i = i / 10) {
//				int r = i % 10;
//				sum += r;
//				prod *= r;
//			}
			while (n != 0) {
				int r = n % 10;
				sum += r;
				prod *= r;
				n /= 10;
			}
			if (sum % N == 0 && prod % N == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 123, 22303546, 302165 };

		System.out.println(magicNumber(arr, arr.length));

	}
}
