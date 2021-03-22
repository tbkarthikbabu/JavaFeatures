package dev.eight.feature.sort;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * 
 * check the int array and store the values into map key as numbers and values
 * as count of numbers
 * 
 * <li>e.g.Integer count = tMap.get(a[i]); {4=3, 6=1, 12=1, 34=1}
 * 
 * <li>TreeMap is used to sort the list, Sorted Order
 * 
 * @author karth
 *
 */
public class CountByTMap {

	public static void main(String[] args) {

		int[] a = { 4, 6, 12, 34, 4, 4 };

		//
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
