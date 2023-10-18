package basic;

public class LeetCode_326_PowerOfThree {
	public static boolean isPowerOfThree(int n) {
		while (n % 3 == 0) {
			n /= 3;
		}
		return n == 1;
	}

	public static void main(String[] args) {
		int n = 27;
		System.out.println(isPowerOfThree(n));
	}
}
