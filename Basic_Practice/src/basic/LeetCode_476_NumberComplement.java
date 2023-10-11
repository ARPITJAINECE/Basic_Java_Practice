package basic;

public class LeetCode_476_NumberComplement {
	public static int findComplement(int num) {
		String a = Integer.toBinaryString(num);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '1') {
				sb.append('0');
			} else if (a.charAt(i) == '0') {
				sb.append('1');
			}
		}
		return Integer.parseInt(sb.toString(), 2);
	}

	public static void main(String[] args) {
		int num = 5;
		System.out.println(findComplement(num));
	}
}
