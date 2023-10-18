package basic;

public class LeetCode_1281_SubtractSumAndProductOfTheDigitsOfANumber {
	public static int subtractProductAndSum(int n) {
		int sum = 0;
		int prod = 1;
		while (n != 0) {
			int newNumber = n % 10;
			sum += newNumber;
			prod *= newNumber;
			n /= 10;
		}
		return prod - sum;
	}

	public static void main(String[] args) {
		int n = 234;
		System.out.println(subtractProductAndSum(n));
	}
}
