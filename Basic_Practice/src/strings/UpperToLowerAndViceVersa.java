package strings;

public class UpperToLowerAndViceVersa {

	public static void main(String[] args) {
		String s = "abcdABCD";
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				ch[i] = (char) ((int) ch[i] - 32);
			} else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				ch[i] = (char) ((int) ch[i] + 32);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			System.out.print(ch[i]);
		}
	}
}