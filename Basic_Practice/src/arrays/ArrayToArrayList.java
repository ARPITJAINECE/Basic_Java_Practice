package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		List<Integer> arrayList = new ArrayList<Integer>();
		for (int num : arr) {
			arrayList.add(num);
		}
		for (int a : arrayList) {
			System.out.println(a);
		}
	}
}