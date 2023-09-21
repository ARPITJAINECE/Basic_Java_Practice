package strings;

public class LongestPalindromicString {
	public static String palindromeLongest(String newString) {
		if (newString == null) {
			return "";
		}
		String longestPalin = "";
		int maxLength = 0;
		char[] ch = newString.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i; j < ch.length; j++) {
				StringBuilder sb = new StringBuilder();
				for (int k = i; k <= j; k++) {
					sb.append(ch[k]);
				}
				if (isPalindrome(sb.toString()) && sb.length() > maxLength) {
					maxLength = sb.length();
					longestPalin = sb.toString();
				}
			}
		}
		return longestPalin;
	}

	public static boolean isPalindrome(String str) {
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "kyyrjtdplseovzwjkykrjwhxquwxsfsorjiumvxjhjmgeueafubtonhlerrgsgohfosqssmizcuqryqomsipovhhodpfyudtusjhonlqabhxfahfcjqxyckycstcqwxvicwkjeuboerkmjshfgiglceycmycadpnvoeaurqatesivajoqdilynbcihnidbizwkuaoegmytopzdmvvoewvhebqzskseeubnretjgnmyjwwgcooytfojeuzcuyhsznbcaiqpwcyusyyywqmmvqzvvceylnuwcbxybhqpvjumzomnabrjgcfaabqmiotlfojnyuolostmtacbwmwlqdfkbfikusuqtupdwdrjwqmuudbcvtpieiwteqbeyfyqejglmxofdjksqmzeugwvuniaxdrunyunnqpbnfbgqemvamaxuhjbyzqmhalrprhnindrkbopwbwsjeqrmyqipnqvjqzpjalqyfvaavyhytetllzupxjwozdfpmjhjlrnitnjgapzrakcqahaqetwllaaiadalmxgvpawqpgecojxfvcgxsbrldktufdrogkogbltcezflyctklpqrjymqzyzmtlssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxidxsofhmhzygklliovnwqbwwiiyarxtoihvjkdrzqsnmhdtdlpckuayhtfyirnhkrhbrwkdymjrjklonyggqnxhfvtkqxoicakzsxmgczpwhpkzcntkcwhkdkxvfnjbvjjoumczjyvdgkfukfuldolqnauvoyhoheoqvpwoisniv";
		String longPalindromeString = palindromeLongest(s);
		System.out.println(longPalindromeString);
	}

}
