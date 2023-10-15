package basic;

public class LeetCode_1137_TribonacciSeries {
	public static int tribonacci(int n) {
		int t0 = 0;
		int t1 = 1;
		int t2 = 1;
		int out = 0;
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		for (int i = 3; i <= n; i++) {
			out = t0 + t1 + t2;
			t0 = t1;
			t1 = t2;
			t2 = out;
		}
		return out;
	}

	public static void main(String[] args) {
		int n = 4;
		System.out.println(tribonacci(n));
	}
}
