package strings;

public class DuplicateWordsInGivenString {

	public static void main(String[] args) {
		String a = "Arpit name is Arpit is name arpit";
		String s = a.toLowerCase();
		String[] sArray = s.split(" ");
//		for (int i = 0; i < sArray.length; i++) {
//			System.out.println(sArray[i]);
//		}
		for (int i = 0; i < sArray.length; i++) {
			int count = 0;
			for (int j = i + 1; j < sArray.length; j++) {
//				if (sArray[i].contains(sArray[j])) {
//					System.out.println("duplicate is there " + sArray[i]);
//					return;
//				} 
				if (sArray[i].equals(sArray[j])) {
					count++;
					sArray[j] = "0";
				}
			}
			if (count > 0 && sArray[i] != "0") {
				System.out.println(sArray[i]);
			}
		}
	}

}
