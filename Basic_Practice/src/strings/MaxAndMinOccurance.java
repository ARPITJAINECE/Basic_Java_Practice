package strings;

public class MaxAndMinOccurance {

	public static void main(String[] args) {
		String a = "abcda";
		String s = a.toLowerCase();
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
				System.out.println(ch[i] + " occured " + count + " times.");
			}
		}
	}

}
