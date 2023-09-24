package strings;

public class LeetCode_43_MultiplyStrings {
	public static String multiply(String num1, String num2) {
		long firstInteger = Long.parseLong(num1);
		long secondInteger = Long.parseLong(num2);
		long multiplicationIs = firstInteger * secondInteger;
		String convertedString = String.valueOf(multiplicationIs);
		return convertedString;
	}

	public static void main(String[] args) {
		String num1 = "498828660196", num2 = "840477629533";
		System.out.println(multiply(num1, num2));
	}
}
