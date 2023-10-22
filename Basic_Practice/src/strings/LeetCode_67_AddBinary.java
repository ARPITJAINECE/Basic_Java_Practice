package strings;

public class LeetCode_67_AddBinary {
	public static String addBinary(String a, String b) {
		int first = Integer.parseInt(a,2);
		int second = Integer.parseInt(b,2);
		int summation = first + second;
		return Integer.toBinaryString(summation);
	}

	public static void main(String[] args) {
		String a = "11";
		String b = "1";
		System.out.println(addBinary(a, b));
	}
}
