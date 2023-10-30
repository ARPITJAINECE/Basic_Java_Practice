package patternStar;

public class PatternSecond {
	public static void main(String[] args) {
		int rows = 9;
		int columns = 9;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				if (i == j || i + j == (rows + 1) || i == 1 || j == 1 || i == rows || j == columns) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
