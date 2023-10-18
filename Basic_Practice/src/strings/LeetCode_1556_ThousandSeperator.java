package strings;

public class LeetCode_1556_ThousandSeperator {
	public static String thousandSeperator(int n) {
		String number = String.valueOf(n);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < number.length(); i++) {
			if (i != 0 && (number.length() - i) % 3 == 0) {
				sb.append(".");
			}
			sb.append(number.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		int n = 10000;
		System.out.println(thousandSeperator(n));
	}
}
