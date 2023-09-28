package basic;

public class Singleton {
	private static Singleton instance_Singleton = null;
	public String str;

	private Singleton() {
		str = "My Name is Arpit Jain";
	}

	public static Singleton getInstance() {
		if (instance_Singleton == null) {
			instance_Singleton = new Singleton();
		}
		return instance_Singleton;
	}

	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		z.str = (z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}
}
