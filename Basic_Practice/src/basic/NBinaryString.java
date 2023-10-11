package basic;

import java.util.ArrayList;
import java.util.List;

public class NBinaryString {
	public static void main(String[] args) {
		int n = 5; 
		List<String> binaryList = new ArrayList<>();

		for (int i = 0; i < Math.pow(2, n); i++) {
			String binaryStr = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
			binaryList.add(binaryStr);
		}
		for (String binary : binaryList) {
			System.out.println(binary);
		}
	}
}
