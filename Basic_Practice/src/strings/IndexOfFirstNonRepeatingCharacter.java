package strings;

public class IndexOfFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "ovvle";
		s.toLowerCase();
		char[] ch = s.toCharArray();
		int a = 0;
		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (!(ch[i] == ch[j])) {
					a = i;
					break;
				}
			}
		}
		System.out.println(a);
	}

}
//package strings;
//
//public class IndexOfFirstNonRepeatingCharacter {
//
//	public static void main(String[] args) {
//		String s = "arpitarpi";
//		s.toLowerCase();
//		char[] ch = s.toCharArray();
//		int count = 0;
//		for (char c : ch) {
//			if (s.indexOf(c) == s.lastIndexOf(c)) {
//				System.out.println(c);
//				break;
//			}
//		}
//	}
//
//}
