package patternStar;

public class StarSixth {
	public static void main(String[] args) {
		// mirrored right pascal triangle
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int s = n - i; s >= 1; s--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int s = 1; s <= n - i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
