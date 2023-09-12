package strings;

public class RotationElements {

	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "cdeab";
		String s3 = s1 + s1;
		if (s3.contains(s2)) {
			System.out.println("Contains");
		} else {
			System.out.println("Does Not Contains");
		}
	}
}