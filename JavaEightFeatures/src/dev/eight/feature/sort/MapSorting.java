package dev.eight.feature.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * Sorting the HashMap Key using the TreeMap and Cllections.sort
 * 
 * <li>1.Convert HashMap into TreeMap
 * 
 * <li>2.Convert HashMap keys into ArrayList and sorting the keys then get the
 * values by get(object)
 * 
 * @author karth
 *
 */
public class MapSorting {

	public static void main(String[] args) {

		Map<String, Integer> hm = new HashMap<>();

		hm.put("Karthi", 100);
		hm.put("Ravi", 200);
		hm.put("Kumar", 300);
		hm.put("Kader", 400);
		hm.put("Sathish", 100);

		System.out.println("Convert HashMap into TreeMap using Construtor injection");
		Map<String, Integer> tMap2 = new TreeMap<>(hm);
		tMap2.forEach((k, v) -> System.out.println(k + ":" + v));

		System.out.println("Convert HashMap into TreeMap using PutAll Method injection");
		Map<String, Integer> tMap = new TreeMap<>();
		tMap.putAll(hm);
		tMap.forEach((k, v) -> System.out.println(k + ":" + v));

		System.out.println("Store keys into ArrayList and sorting out the list");
		List<String> ltKey = new ArrayList<>(hm.keySet());
		Collections.sort(ltKey);
		ltKey.forEach(x -> System.out.println(x + ":" + hm.get(x)));

	}

}
