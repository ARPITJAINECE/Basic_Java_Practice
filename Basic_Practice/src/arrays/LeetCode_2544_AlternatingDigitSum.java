package arrays;

public class LeetCode_2544_AlternatingDigitSum {
	public static int alternateDigitSum(int n) {
		int sum = 0;
		int sign = 1;
		while (n != 0) {
			sum += sign * (n % 10);
			sign = -sign;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 25;
		System.out.println(alternateDigitSum(n));
	}
}
