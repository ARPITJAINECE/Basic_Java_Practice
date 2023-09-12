package arrays;

import java.util.Scanner;

public class CountNoOfArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of array elements: ");
		int totalNos = sc.nextInt();
		int[] arr = new int[totalNos];
		System.out.println("enter the array elements: ");
		for (int i = 0; i < totalNos; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for (int j = 0; j < totalNos; j++) {
//			boolean isPrime = true;
			int a = 1;
			for (int i = 2; i < Math.sqrt(arr[j]); i++) {
				if (arr[j] % i == 0) {
//					isPrime = false;
					a = 0;
					break;
				}
			}
			if (a == 1) {
				System.out.println(arr[j] + " is prime number.");
				count++;
			}
		}
		System.out.println("Total prime nos are : " + count);
		sc.close();
	}

}
