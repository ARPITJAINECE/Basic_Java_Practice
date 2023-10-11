package multiThreading;

public class first implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("firsts i is : " + i);
		}
	}
}
