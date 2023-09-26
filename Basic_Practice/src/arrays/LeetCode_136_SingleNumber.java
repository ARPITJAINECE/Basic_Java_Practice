package arrays;

public class LeetCode_136_SingleNumber {
	public static int singleNumber(int[] nums) {
//		int count = 0;
		int singleNos = 0;
		if (nums.length == 1) {
			return nums[0];
		}
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 0) {
				singleNos = nums[i];
			}
		}
		return singleNos;
	}

	public static void main(String[] args) {
		int nums[] = { 4, 1, 2, 1, 2 };
		System.out.println(singleNumber(nums));
	}
}
