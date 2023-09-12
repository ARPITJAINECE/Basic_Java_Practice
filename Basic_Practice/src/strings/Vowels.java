package strings;

public class Vowels {

	public static void main(String[] args) {
		String s = "abcdefghijkl";
//		char[] ch = s.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			if (ch == 65 || ch == 69 || ch == 73 || ch == 79 || ch == 85 || ch == 97 || ch == 101 || ch == 105
//					|| ch == 111 || ch == 117) {
//
//			}
//		}
		s.toLowerCase();
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				System.out.println(i + ":::at:::" + s.charAt(i));
			}
		}
	}

}
