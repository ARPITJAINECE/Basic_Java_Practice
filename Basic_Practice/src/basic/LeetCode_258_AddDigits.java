package basic;

public class LeetCode_258_AddDigits {
	public static int addDigits(int num) {

		while (num >= 10) {
			int sum = 0;
			while (num != 0) {
				sum = sum + num % 10;
				num /= 10;
			}
			num = sum;
		}
		return num;
	}

	public static void main(String[] args) {
		int num = 38;
		System.out.println(addDigits(num));
	}
}
