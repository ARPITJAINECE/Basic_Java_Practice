package arrays;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_1748_SumOfUniqueElements {
	public static int sumOfUnique(int[] nums) {
		int sum = 0;
		Set<Integer> uniqueSet = new HashSet<Integer>();
		for (int num : nums) {
			if (uniqueSet.add(num)) {
				sum += num;
			} 
//			else {
//				sum -= num;
//			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 2 };
		System.out.println(sumOfUnique(nums));
	}
}
