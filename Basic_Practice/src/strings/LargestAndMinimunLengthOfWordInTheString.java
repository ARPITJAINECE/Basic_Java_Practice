package strings;

import java.util.Arrays;

public class LargestAndMinimunLengthOfWordInTheString {

	public static void main(String[] args) {
		String a = "Arpit name is Arpit is abcdefgh name arpit ijklmopq";
		String s = a.toLowerCase();
		String[] sArray = s.split(" ");
		int arr[] = new int[sArray.length];
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i] + " and length is : " + sArray[i].length());
			arr[i] = sArray[i].length();
		}
		Arrays.sort(arr);
		System.out.println(arr[arr.length - 1]);
	}
}