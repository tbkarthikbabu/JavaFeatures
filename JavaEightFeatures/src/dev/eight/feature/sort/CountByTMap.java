package dev.eight.feature.sort;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * 
 * Here store the count of the numbers in values of HashMap
 * 
 * get null unless key not present in HashMap, first stored it statically 1 get
 * the values of the key if present in hashmap, subsequently it gets increased
 * into values of the key
 * 
 * using Integer count = tMap.get(a[i]); {4=1, 6=2, 12=3, 34=1}
 * 
 * TreeMap is used to sort the list
 * 
 * @author karth
 *
 */
public class CountByTMap {

	public static void main(String[] args) {

		int[] a = { 12, 34, 6, 4, 12, 6, 12, 12, 12, 7, 6 };

		Map<Integer, Integer> tMap = new TreeMap<>();

		for (int i = 0; i < a.length; i++) {

			Integer count = tMap.get(a[i]);
			System.out.println("c->" + count);
			if (count == null) {
				tMap.put(a[i], 1);
			} else {
				tMap.put(a[i], ++count);
			}
		}

		for (Entry e : tMap.entrySet()) {
			System.out.println(e.getKey().toString() + "," + e.getValue());
		}

	}

}
