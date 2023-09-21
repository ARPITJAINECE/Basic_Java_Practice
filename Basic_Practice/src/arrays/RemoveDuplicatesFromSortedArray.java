package arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int nums[] = { 1, 1, 2 };
		int expectedNums[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
//			int count = 0;

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
//					count++;
					expectedNums[i] = nums[i];
				} else if (nums[i] != nums[j]) {
					expectedNums[i] = nums[i];
				}
			}

		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(expectedNums[i]);
		}
	}

}
