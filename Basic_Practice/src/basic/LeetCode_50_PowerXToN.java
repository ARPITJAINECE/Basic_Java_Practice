package basic;

public class LeetCode_50_PowerXToN {
	public static double myPow(double x, double n) {
//		if (n == 0) {
//			return 1;
//		} else if (n < 0) {
//			n = n * (-1);
//			double variable = (x * myPow(x, n - 1));
//			return (1 / variable);
//		} else {
//			return (x * myPow(x, n - 1));
//		}

		return Math.pow(x, n);
	}

	public static void main(String[] args) {
//		double x = Math.pow(10, -5);
		double x = 10;

		double n = 10000;
		System.out.println(myPow(x, n));
		// System.out.println(Integer.MAX_VALUE-1);
	}
}
