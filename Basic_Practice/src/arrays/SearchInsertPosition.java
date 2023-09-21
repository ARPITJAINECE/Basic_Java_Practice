package arrays;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int nums[] = { 1, 3, 5, 7 };
		int target = 8;
		int notFound = 0;
		boolean flag = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				System.out.println(i);
				flag = false;
			} else if (nums[i] < target) {
				notFound = i + 1;
				flag = true;
			}
		}
		if (flag) {
			System.out.println(notFound);
		}
	}

}
