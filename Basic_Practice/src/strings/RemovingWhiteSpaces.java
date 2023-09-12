package strings;

public class RemovingWhiteSpaces {

	public static void main(String[] args) {
		String s = "    abcd  efgh  ijkl   ";
		String s1 = s.replaceAll("\\s+", "");
		System.out.print(s1);
	}

}
