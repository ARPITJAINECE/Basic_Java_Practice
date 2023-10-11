package basic;

public class SingletonClassExample {
	private static SingletonClassExample instance;

	public SingletonClassExample() {
		// TODO Auto-generated constructor stub
	}

	public static SingletonClassExample getInstance() {
		if (instance == null) {
			instance = new SingletonClassExample();
		}
		return instance;
	}

	public static void main(String[] args) {
		SingletonClassExample s1 = SingletonClassExample.getInstance();
		SingletonClassExample s2 = SingletonClassExample.getInstance();
		System.out.println(s1 == s2);// it will give true, it means that both the references are pointing to the same
										// instance
	}
}
