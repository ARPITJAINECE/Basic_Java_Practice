package strings;

public class UpperCase {

	public static void main(String[] args) {
		String s = "abcd";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) ((int) ch[i] - 32);
			}
		}
		for (int j = 0; j < ch.length; j++) {
			System.out.println(ch[j]);
		}
	}

}
