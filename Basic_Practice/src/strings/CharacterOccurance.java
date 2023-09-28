package strings;

public class CharacterOccurance {
	public static int charOccurance(String s, char key) {
		s = s.replaceAll(" ", "");
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == key) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s = "my name is arpit jain";
		char key = 's';
		System.out.println(charOccurance(s, key));
	}
}
