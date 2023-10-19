package basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode_414_ThirdmaximumNumber {
	public static int thirdMax(int[] nums) {
		Set<Integer> mySet = new HashSet<>();
		for (Integer s : nums) {
			mySet.add(s);
		}
		int[] myArray = new int[mySet.size()];
		int i = 0;
		for (int number : mySet) {
			myArray[i++] = number;
		}
		Arrays.sort(myArray);
		if (myArray.length < 3) {
			return myArray[myArray.length - 1];
		} else {
			return myArray[myArray.length - 3];
		}
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1 };
		System.out.println(thirdMax(nums));
	}
}
