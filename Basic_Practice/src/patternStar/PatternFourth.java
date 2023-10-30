package patternStar;

import java.util.Scanner;

public class PatternFourth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of rows and columns (odd number): ");
		int n = scanner.nextInt();

		if (n % 2 != 0) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
						System.out.print("*");
					} else if (i == n / 2 || j == n / 2) {
						System.out.print("*");
					} else if (i < n / 2 && j <= n / 2 && j == n / 2 - i) {
						System.out.print("*");
					} else if (i > n / 2 && j <= n / 2 && j == i - n / 2) {
						System.out.print("*");
					} else if (i < n / 2 && j >= n / 2 && j == n / 2 + i) {
						System.out.print("*");
					} else if (i > n / 2 && j >= n / 2 && j == 3 * n / 2 - i - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("Please enter an odd number for rows and columns.");
		}

		scanner.close();
	}
}
