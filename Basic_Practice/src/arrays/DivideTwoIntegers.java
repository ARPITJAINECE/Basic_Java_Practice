package arrays;

public class DivideTwoIntegers {

	public static void main(String[] args) {
		int dividend = -10;
		int divisor = 3;
		int quotient = dividend / divisor;
		if (quotient > (Math.pow(2, 31) - 1)) {
			System.out.println((Math.pow(2, 31) - 1));
		} else if (quotient < (-1 * Math.pow(2, 31))) {
			System.out.println(-1 * Math.pow(2, 31));
		} else {
			System.out.println(quotient);
		}
	}

}
