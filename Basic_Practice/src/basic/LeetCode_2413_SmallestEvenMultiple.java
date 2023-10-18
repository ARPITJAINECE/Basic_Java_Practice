package basic;

public class LeetCode_2413_SmallestEvenMultiple {
	public static int smallestEvenMultiple(int n) {
		int found = 0;
		for (int i = n; i <= Integer.MAX_VALUE; i++) {
			if (i % n == 0 && i % 2 == 0) {
				found = i;
				break;
			}
		}
		return found;
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(smallestEvenMultiple(n));
	}
}
