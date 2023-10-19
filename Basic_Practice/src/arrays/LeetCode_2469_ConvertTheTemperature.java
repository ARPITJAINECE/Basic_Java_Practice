package arrays;

import java.util.Arrays;

public class LeetCode_2469_ConvertTheTemperature {
	public static double[] convertTemperature(double celsius) {
		double[] arr = new double[2];
		double kelvin = celsius + 273.15;
		double Fahrenheit = celsius * 1.80 + 32.00;
		arr[0] = kelvin;
		arr[1] = Fahrenheit;
		return arr;
	}

	public static void main(String[] args) {
		double celsius = 36.50;
		System.out.println(Arrays.toString(convertTemperature(celsius)));
	}
}
