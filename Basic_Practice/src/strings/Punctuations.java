package strings;

public class Punctuations {

	public static void main(String[] args) {
		String s = "jbdsab,jnfkjn,dja,fnio,j";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ',') {
				count++;
			}
		}
		System.out.println(count);
	}

}
