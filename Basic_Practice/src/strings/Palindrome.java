package strings;

public class Palindrome {

	public static void main(String[] args) {
		String s1 = "madam";
//		String s2 = "madam";
		char[] c1 = s1.toCharArray();
//		char[] c2 = s2.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			for (int j = s1.length() - 1; j > 0; j--) {
				if (c1[i] == c1[j]) {
					System.out.println("Palindrome");
					return;
				} else {
					System.out.println("Not Palindrome");
					return;
				}
			}
		}
	}

}
