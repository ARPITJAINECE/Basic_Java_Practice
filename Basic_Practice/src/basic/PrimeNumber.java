package basic;

public class PrimeNumber {
	public static boolean isPrime(int number) {
		// 2 is the lowest prime number
		// 3,5,7,11,.................
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int number = 13;
		System.out.println(isPrime(number));
	}

}
