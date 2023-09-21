package map;

import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		TreeMap<Employee, Integer> map = new TreeMap<Employee, Integer>();
		map.put(new Employee("mike", 20), 100);
		map.put(new Employee("john", 30), 200);
		map.put(new Employee("ryan", 40), 300);
		map.put(new Employee("lisa", 50), 400);
		map.forEach((k, v) -> System.out.println(k + " ::: " + v));
	}

}
