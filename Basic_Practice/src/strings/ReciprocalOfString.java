package strings;

public class ReciprocalOfString {

	public static void main(String[] args) {
		String s = "prakhar";
		char rev;
		for (int i = 0; i < s.length(); i++) {
			rev = (char) (219 - (int) s.charAt(i));
			System.out.println(rev);
		}
	}

}
