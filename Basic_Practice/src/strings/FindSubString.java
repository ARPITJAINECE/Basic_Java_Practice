package strings;

public class FindSubString {
	public static boolean isSubstring(String s) {
		return s.contains("e ");
	}

	public static void main(String[] args) {
		String s = "my name is arpit jain";
		System.out.println(isSubstring(s));
	}
}
