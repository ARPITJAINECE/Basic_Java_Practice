package basic;

public class LeetCode_342_PowerOf4 {
	public static boolean isPowerOfFour(int n) {
		for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
			if (n == 1) {
				return true;
			} else if (Math.pow(4, i) == n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int n = 16;
		System.out.println(isPowerOfFour(n));
	}
}
