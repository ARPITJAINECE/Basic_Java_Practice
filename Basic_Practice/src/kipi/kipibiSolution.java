package kipi;

import java.util.Arrays;

public class kipibiSolution {
public static int[] solution(int []arr) {
	Arrays.sort(arr);
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i+1]!=arr[i]) {
			arr[i]=-1;
		}
	}
	return arr;	
}
	public static void main(String[] args) {
		int []arr= {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
//		solution(arr);
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(solution(arr));
		}
//		System.out.println(solution(arr.toString()));
	}

}
