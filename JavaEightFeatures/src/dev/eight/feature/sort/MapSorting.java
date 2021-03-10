package dev.eight.feature.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.TreeMap;

/**
 * 
 * Sorting the HashMap key using the TreeMap
 * 
 * @author karth
 *
 */
public class MapSorting {

	public static void main(String[] args) {

		Map<String, Integer> hm = new HashMap<>();
		Map<String, Integer> tMap = new TreeMap<>();

		hm.put("Karthi", 100);
		hm.put("Ravi", 200);
		hm.put("Kumar", 300);
		hm.put("Kader", 400);
		hm.put("Sathish", 100);

		Map<String, Integer> tMap2 = new TreeMap<>(hm);

		tMap.putAll(hm);

		System.out.println("****Using TreeMap PutAll Methodsr*****");

		for (Entry e : tMap.entrySet()) {
			System.out.print(e.getKey().toString() + "," + e.getValue());
		}
		System.out.println();
		System.out.println("****Using TreeMap Construtor*****");

		for (Entry en : tMap2.entrySet()) {
			System.out.print(en.getKey().toString() + "," + en.getValue());
		}

		List<String> ltKey = new ArrayList<>(hm.keySet());

		Collections.sort(ltKey);

		System.out.println();
		System.out.println("****Using ArrayList*****");
		for (String s : ltKey) {
			System.out.print(s + "," + hm.get(s));
		}
	}

}
