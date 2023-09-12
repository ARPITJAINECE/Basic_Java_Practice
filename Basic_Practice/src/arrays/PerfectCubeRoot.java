package arrays;

public class PerfectCubeRoot {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 8 };
		int n = arr.length;
		int count = 0;

		for (int i = 0; i < n; i++) {
			int product = 1;
			for (int j = i; j < n; j++) {
				product *= arr[j];
				if (isPerfectCube(product)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static boolean isPerfectCube(int num) {
		int cubeRoot = (int) Math.cbrt(num);
		return cubeRoot * cubeRoot * cubeRoot == num;
	}
}
