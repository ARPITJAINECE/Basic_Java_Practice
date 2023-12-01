package basic;

class Animal {
	public static void CallAnimal() {
		System.out.println("Calling from the Animal class");
	}
}

class LivingThings extends Animal {
	public static void CallAnimal() {
		System.out.println("Calling from the LivingThings class");
	}
}

public class InstanceOfOperator {
	public static void main(String[] args) {
		Animal myAnimal = new LivingThings();
		if (myAnimal instanceof LivingThings) {
			System.out.println("myAnimal is instanceOf LivingThings");
		} else if (myAnimal instanceof Animal) {
			System.out.println("myAnimal is instanceOf Animal");
		}
	}
}
