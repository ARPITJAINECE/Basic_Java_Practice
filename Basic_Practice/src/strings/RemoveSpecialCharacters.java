package strings;

public class RemoveSpecialCharacters {
	public static void main(String[] args) {
		// use regex as i only want a to z and A to Z and 0 to 9
		String s = "#$%^&abcd *() ghjkil 12345 nbuJCCASJN";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}
}