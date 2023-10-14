package strings;

public class LeetCode_1816_TruncateSentence {
	public static String truncateSentence(String s, int k) {
		String[] newS = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k; i++) {
			sb.append(newS[i] + " ");
		}
		return sb.toString().strip();
	}

	public static void main(String[] args) {
		String s = "Hello how are you Contestant";
		int k = 4;
		System.out.println(truncateSentence(s, k));
	}
}
