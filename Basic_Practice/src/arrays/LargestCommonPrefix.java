package arrays;

//class Myexception1 extends Exception {
//}
//
//class Myexception2 extends Exception {
//}
//
//public class LargestCommonPrefix {
//	public static void method1() throws Exception {
//		try {
//			System.out.println("5");
//			throw new Myexception1();
//		} catch (Exception e) {
//			System.out.println("6");
//			throw new Myexception2();
//		} finally {
//			System.out.println("7");
//			throw new Exception();
//		}
//	}
//
//	public static void main(String[] args) throws Exception {
//		try {
//			System.out.println("1");
//			method1();
//			System.out.println("2");
//		} catch (Exception e) {
//			System.out.println("3");
//			throw new Myexception2();
//		} finally {
//			System.out.println("4");
//			throw new Myexception1();
//		}
//	}
//}
public class LargestCommonPrefix {

	public static void main(String[] args) {
		String[] s = { "arpit", "arpi", "arp" };
		int len = s.length;
		String newS[] = new String[3];
		for (int i = 0; i < s.length; i++) {
			newS[i] = s[i];
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(newS[i]);
		}
//		for(int )

	}

}
