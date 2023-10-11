package arrays;

public class LeetCode_2520_CountTheDigitsThatDivideTheNumber {
	public static int countDigits(int num) {
		int temp = num, count = 0;
		while (temp > 0) {
			int div = temp % 10;
			if (num % div == 0) {
				count++;
			}
			temp = temp / 10;
		}
		return count;
	}

	public static void main(String[] args) {
		int num = 1248;
		System.out.println(countDigits(num));
	}
}
