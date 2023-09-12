package arrays;

import java.util.ArrayList;

public class MedinOfOddAndEven {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 25, 29, 31, 27, 13, 18, 58, 54, 63 };
		int[] brr = new int[arr.length];
		int[] crr = new int[arr.length];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] % 2 == 0) {
				brr[i] = arr[i];
			} else if (arr[i] % 2 != 0) {
				crr[i] = arr[i];
			}
		}
		System.out.println("array brr that contains even is :");
		for (int i = 0; i < brr.length - 1; i++) {
			System.out.println(brr[i]);
		}
		System.out.println("array crr that contains odd is :");
		for (int i = 0; i < crr.length; i++) {
			System.out.println(crr[i]);
		}
		ArrayList<Integer> bList = new ArrayList<Integer>();
		for (int i = 0; i < brr.length; i++) {
			if (brr[i] != 0) {
				bList.add(brr[i]);
			}
		}
		ArrayList<Integer> cList = new ArrayList<Integer>();
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] != 0) {
				cList.add(crr[i]);
			}
		}
		System.out.println("array list:");
		System.out.println("blist is :");
		System.out.println(bList);
		System.out.println("clist is :");
		System.out.println(cList);
		System.out.println("finding the median of even: ");
		int count1 = 0;
		for (int i = 0; i < bList.size(); i++) {
			while (bList.isEmpty()) {
				count1++;
			}
		}
		for (int i = 0; i < bList.size(); i++) {
			if (count1 % 2 == 0) {
				System.out.println(bList.get((i / 2) + 1));
			} else if (count1 % 2 != 0) {
				System.out.println(bList.get(i / 2));
			}
		}
		System.out.println("Even element list");
		count1 = bList.size();
		if (count1 % 2 == 0) {
			System.out.println(bList.get((count1 / 2) + 1));
		} else if (count1 % 2 != 0) {
			System.out.println(bList.get(count1 / 2));
		}
		System.out.println("finding the median of odd: ");
		System.out.println("result");
		System.out.println(cList.size());
		int n = cList.size();
		if (cList.size() % 2 == 0) {
			System.out.println(cList.get((n / 2) + 1));
		} else if (cList.size() % 2 != 0) {
			System.out.println(cList.get(n / 2));
		}
		// }
	}

}
