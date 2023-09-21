package arrays;

public class MajorityElement_nBY2 {

	static int majorityElement(int[] a) {
		int len = a.length;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {

				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 2, 3 };
		System.out.println(majorityElement(arr));

	}

}
