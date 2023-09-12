package strings;

import java.util.Scanner;

public class DivideStringInNequalParts {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("The entered string is: " + str);
		System.out.println("enter in how many number of parts you want to divide the entered string: ");
		int n = sc.nextInt();
		int sub_size;
		sub_size = str.length() / n;
		for (int i = 0; i < str.length(); i++) {
			if (str.length() % n != 0) {
				System.out.println("wrong size");
				return;
			} else if (i % sub_size == 0) {
				System.out.println();
			}
			System.out.print(str.charAt(i));
		}
	}
}