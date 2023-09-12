package arrays;

public class RemoveParticularCharacterFromString {

	public static void main(String[] args) {
		String s = "abccchdehfg";
		StringBuilder sb = new StringBuilder();
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if (c != 'h') {
				sb.append(c);
			}
		}
//		Set<String> str = new HashSet<String>();
//		str.add(sb.toString());
//		System.out.println(str);
//		for (int i = 0; i < sb.length(); i++) {
		System.out.println(sb.toString());
//		}
	}

}
