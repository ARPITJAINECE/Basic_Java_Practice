package basic;

public class LeetCode_204_CountPrimes {
	static int countPrimes(int n) {
		int count = 0;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(countPrimes(n));
	}
}
