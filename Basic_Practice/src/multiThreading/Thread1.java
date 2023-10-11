package multiThreading;

public class Thread1 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new first());
		Thread t2 = new Thread(new second());
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}
}
