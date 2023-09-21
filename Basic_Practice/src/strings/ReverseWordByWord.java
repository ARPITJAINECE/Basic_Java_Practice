package strings;

public class ReverseWordByWord {

	public static void main(String[] args) {
		String s = "my name is Arpit";
//		int len = s.length();
//		String rev = "";
//		for (int i = len - 1; i >= 0; i--) {
//			rev = rev + s.charAt(i);
//		}
//		System.out.println(rev);
		String rev = "";
		String stringArray[] = s.split(" ");
		for (int i = stringArray.length - 1; i >= 0; i--) {
			rev = rev + stringArray[i] + " ";
		}
		System.out.println(rev);// rev.strip()
	}

}
