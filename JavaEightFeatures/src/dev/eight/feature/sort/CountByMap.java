package dev.eight.feature.sort;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * check the int array and store the values into map key as numbers and values
 * as count of numbers
 * 
 * <li>e.g.Integer count = tMap.get(a[i]); {4=3, 34=1, 12=1, 6=1}
 * 
 * <li>Non sorted order
 * 
 * @author karth
 *
 */
public class CountByMap {

	public static void main(String[] args) {

		int[] a = { 4, 6, 12, 34, 4, 4 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length; i++) {

			Integer chkExists = map.get(a[i]);
			System.out.println("check the map if exists of duplicate values->" + chkExists);
			if (chkExists == null) {
				// values set as 1 for first unique numbers in map
				map.put(a[i], 1);
			} else {
				// values set incremented for consequentive duplicate numbers
				map.put(a[i], ++chkExists);
			}
		}

		// map iteration using the entrySet/rows
		for (Entry e : map.entrySet()) {
			System.out.println(e.getKey().toString() + "," + e.getValue());
		}

		// map iteration using forEach method
		map.forEach((k, v) -> System.out.println(k + ":" + v));

	}

}
