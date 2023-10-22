//package arrays;
//
//public class LeetCode_137_SingleNumberIII {
//	public static int singleNumber(int[] nums) {
//		int single = 0;
////		Arrays.sort(nums);
////		for (int i = 0; i < nums.length; i++) {
////			for (int j = 0; j < nums.length; j++) {
////				if (nums[i] != nums[j]) {
////					single = nums[i];
////				}
////			}
////		}
//		for (int n : nums) {
//			single ^= n;
//		}
//		return single;
//	}
//
//	public static void main(String[] args) {
//		int nums[] = { 2, 2, 3, 2 };
//		System.out.println(singleNumber(nums));
//	}
//}
//package arrays;
//
//public class LeetCode_137_SingleNumberIII {
//	public static int singleNumber(int[] nums) {
//		int single = 0;
//		for (int n : nums) {
//			single ^= n;
//		}
//		return single;
//	}
//
//	public static void main(String[] args) {
//		int nums[] = { 2, 2, 3, 2 };
//		System.out.println(singleNumber(nums));
//	}
//}
package arrays;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_137_SingleNumberIII {
	public static int singleNumber(int[] nums) {
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		for (int n : nums) {
			myMap.put(n, myMap.getOrDefault(n, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 2, 3, 2 };
		System.out.println(singleNumber(nums));
	}
}