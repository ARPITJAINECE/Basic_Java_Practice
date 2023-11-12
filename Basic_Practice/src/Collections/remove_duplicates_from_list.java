package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class remove_duplicates_from_list {
	public static void main(String[] args) {
		List<String> duplicate_list = new ArrayList<String>();
		duplicate_list.add("one");
		duplicate_list.add("two");
		duplicate_list.add("three");
		duplicate_list.add("one");
		duplicate_list.add("two");
		Set<String> non_duplicate_set = new HashSet<>();
//		List<String> non_duplicate_set = new ArrayList<String>();
		non_duplicate_set.addAll(duplicate_list);
		for (String s : non_duplicate_set) {
			System.out.println(s);
		}

	}
}