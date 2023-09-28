package arrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_412_FizzBuzz {
	public static List<String> fizzBuzz(int n) {
		List<String> listFizzBuzz = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				listFizzBuzz.add("FizzBuzz");
			} else if (i % 3 == 0) {
				listFizzBuzz.add("Fizz");
			} else if (i % 5 == 0) {
				listFizzBuzz.add("Buzz");
			} else {
				listFizzBuzz.add(String.valueOf(i));
			}
		}
		return listFizzBuzz;
	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println(fizzBuzz(n));
	}
}
