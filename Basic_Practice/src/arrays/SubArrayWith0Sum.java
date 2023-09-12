package arrays;

public class SubArrayWith0Sum {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, -2, 3, 4, 5, 6 };
		boolean flag = false;
		for (int i = 0; i < nums1.length - 1; i++) {
			for (int j = i; j < nums1.length - 1; j++) {
				if (nums1[i] + nums1[j] == 0) {
					flag = true;
				}
			}
		}
		System.out.println(flag);
	}

}
