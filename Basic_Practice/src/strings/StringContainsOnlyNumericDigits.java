package strings;

public class StringContainsOnlyNumericDigits {
	public static boolean stringOnlyDigit(String s) {
		return s.matches("[0-9]");
	}

	public static void main(String[] args) {
		String s = "1234";
		System.out.println(stringOnlyDigit(s));
	}
}
