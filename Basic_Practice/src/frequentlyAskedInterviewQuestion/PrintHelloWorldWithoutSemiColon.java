package frequentlyAskedInterviewQuestion;

public class PrintHelloWorldWithoutSemiColon {
	public static void main(String[] args) {
		// 1st method
		if (System.out.printf("hello world" + "\n") == null) {

		}
//		System.out.println();
		// 2nd method
		if (System.out.append("hello world") == null) {

		}
		System.out.println();
		// 3rd method
		if (System.out.append("hello world").equals(null)) {

		}
		System.out.println();
		// 4th method
		for (int i = 0; i < 1; System.out.println("hello world")) {
			i++;
		}
	}
}
