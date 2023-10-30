package arrays;

public class LeetCode_441_ArrangingCoins {
	public static int arrangeCoins(int n) {
//		int left = 0;
//		int right = n;
//		while (left <= right) {
//			int mid = (left + right) / 2;
//			int numberOfCoins = (mid * (mid + 1)) / 2;
//			if (numberOfCoins == n) {
//				return mid;
//			} else if (numberOfCoins > n) {
//				right = mid - 1;
//			} else {
//				left = mid + 1;
//			}
//		}
//		return right;
		return (int) (Math.sqrt(2.0 * n + 0.25) - 0.5);
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(arrangeCoins(n));
	}
}
