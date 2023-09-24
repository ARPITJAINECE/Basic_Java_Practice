package arrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_34FindFirstandLastPositionofElementinSortedArray {
	public static int[] searchRange(int[] nums, int target) {
		List<Integer> listNew = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				listNew.add(i);
			}
		}

		if (listNew.isEmpty()) {
			return new int[] { -1, -1 };
		}
		Integer[] newNums = listNew.toArray(new Integer[listNew.size()]);
		int[] result = new int[newNums.length];
		for (int i = 0; i < newNums.length; i++) {
			result[i] = newNums[i];
		}
		if (result.length == 1) {
			return new int[] { result[0], result[0] };
		}
		int finalResult[] = new int[2];
		finalResult[0] = result[0];
		finalResult[1] = result[result.length - 1];
		return finalResult;
	}

	public static void main(String[] args) {
		int nums[] = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] result = searchRange(nums, target);

		System.out.print("[");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			if (i < result.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
