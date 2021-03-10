package dev.eight.feature.sort;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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
 * @author karth
 *
 */
public class CountByMap {

	public static void main(String[] args) {

		int[] a = { 12, 34, 6, 4, 12, 6, 12, 12, 12, 7, 6 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length; i++) {

			Integer count = map.get(a[i]);
			System.out.println("c->" + count);
			if (count == null) {
				map.put(a[i], 1);
			} else {
				map.put(a[i], ++count);
			}
		}

		for (Entry e : map.entrySet()) {
			System.out.println(e.getKey().toString() + "," + e.getValue());
		}

	}

}
