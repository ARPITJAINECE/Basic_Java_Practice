package strings;

public class SubSet {

	public static void main(String[] args) {
		String s = "arpit";
		int len = s.length();
		int temp = 0;
		String arr[] = new String[len * (len + 1) / 2];
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				arr[temp] = s.substring(i, j + 1);
				temp++;
			}
		}
		// Displaying the string's subsets
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// total counts are
		System.out.println("total counts are : " + temp);
	}

}
