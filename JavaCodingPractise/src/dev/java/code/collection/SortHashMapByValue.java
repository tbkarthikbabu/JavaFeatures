package dev.java.code.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Sort: store the Entry of values into the entryset and convert to list and
 * call the sort method in list class and compareTo method of in build
 * comparator implemeation of list class
 * 
 * @author karth
 *
 */
public class SortHashMapByValue {

	public static void main(String[] args) {

		Map<String, Integer> scores = new HashMap<>();

		// Not maintain the order of the element
		scores.put("David", 95);
		scores.put("Jane", 80);
		scores.put("Mary", 97);
		scores.put("Lisa", 78);
		scores.put("Dino", 65);
		// Override the values of the dublicate keys
		scores.put("Dino", 100);

		System.out.println(scores);

		scores = sortByValue(scores);

		System.out.println(scores);
	}

	private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {

		Map<String, Integer> sortedMapByValue = new LinkedHashMap<>();

		// can store the entry set into the set class
		Set<Entry<String, Integer>> entrySet = scores.entrySet();
		System.out.println(entrySet);

		// sort method in list class so, convert set into list class
		List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
		System.out.println(entryList);

		// sort method in list class, using comparator interface internally
		// using lambda expr and insert the inline method implementation
		entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
		System.out.println(entryList);

		// convert into list to the new hash map
		for (Entry<String, Integer> e : entryList)
			sortedMapByValue.put(e.getKey(), e.getValue());

		return sortedMapByValue;
	}

}
