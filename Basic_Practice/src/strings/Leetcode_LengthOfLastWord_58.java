//package strings;
//
//import java.util.Arrays;
//
//public class Leetcode_LengthOfLastWord_58 {
//
//	public static void main(String[] args) {
//		String s = "Hello World";
//		String[] splitted = s.split(" ");
//		String last = "";
//		System.out.println(Arrays.toString(splitted));
//		for (int i = 0; i < splitted.length; i++) {
//			last = splitted[splitted.length - 1];
//		}
//		System.out.println(last);
//		System.out.println(last.length());
//	}
//
//}
package strings;

public class Leetcode_LengthOfLastWord_58 {
	public static int lengthofLast(String s) {
		String[] splitted = s.split(" ");
		String last = "";
//		System.out.println(Arrays.toString(splitted));
		for (int i = 0; i < splitted.length; i++) {
			last = splitted[splitted.length - 1];
		}
//		System.out.println(last);
//	System.out.println(last.length());
		return last.length();

	}

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(lengthofLast(s));
	}

}
