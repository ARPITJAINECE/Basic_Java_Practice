package basic;

public class LeetCode_367_IsPerfectSquare {
	public static boolean isPerfectSquare(int num) {
		double n = Math.sqrt(num);
		int z = (int) n;
		int x = (int) Math.pow(z, 2);
		if (x == num) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int num = 6;
		System.out.println(isPerfectSquare(num));
	}
}
