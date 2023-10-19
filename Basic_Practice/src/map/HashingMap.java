package map;

import java.util.HashMap;
import java.util.Map;

public class HashingMap {
	public static void main(String[] args) {
		// country(key), population(Integer)
		HashMap<String, Integer> map = new HashMap<>();
		// insertion
		map.put("india", 120);
		map.put("usa", 30);
		map.put("china", 140);
		// displaying
		System.out.println(map);

		map.put("china", 150);
		System.out.println(map);

		// searching
		if (map.containsKey("china")) {
			System.out.println("map contains the china as the key " + map.get("china"));
		} else {
			System.out.println("map does not contains the china as the key in whole");
		}

		// printing values
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println("key: " + e.getKey() + " and its value is : " + e.getValue());
		}

	}
}
