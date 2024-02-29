package basic;

import java.util.stream.Stream;

public class LeetCode_202_HappyNumber {
	public static boolean isHappy(int n) {
		return Stream.iterate(n, a -> getNextNumber(n)).distinct().anyMatch(num -> num == 1);
	}

	private static int getNextNumber(int n) {
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			sum += Math.pow(digit, 2);
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int number = 19;
		System.out.println(number);
		System.out.println("Is " + number + " a happy number? " + isHappy(number));
	}
}
