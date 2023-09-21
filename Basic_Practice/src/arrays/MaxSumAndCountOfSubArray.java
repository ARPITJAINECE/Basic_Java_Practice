package arrays;

public class MaxSumAndCountOfSubArray {

	public static void main(String[] args) {
//		int[] arr = { 1, 0, 2, 3, 5, -8, -4, 12, -8, 0 };
		int[] arr = { 1, -2, 3, 6, -2, -4, 0 };
		int sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				sum += arr[i];
				count++;
			}
		}
		System.out.println("sum is : " + sum);
		System.out.println("count is : " + count);
	}

}
//static int countOccurrences(List<Integer> arr, int x)
//{
//    int res = 0;
//    for (int i=0; i<arr.size(); i++)
//        if (x == arr.get(i))
//          res++;
//    return res;
//}
//
//public static int lonelyinteger(List<Integer> a) {
//// Write your code here
//    for(int i=0;i<a.size();i++){
//        if(countOccurrences(a, a.get(i))==1){
//            return a.get(i);
//        }
//    }
//    return 0;
//}
//
//}