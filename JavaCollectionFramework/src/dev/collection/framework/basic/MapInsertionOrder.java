package dev.collection.framework.basic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * <li>HashMap, Keys are ordered by random order based on the hashing value and
 * store it into index
 * 
 * <li>LinkedHashMap, same features like HashMap but, Keys are ordered by
 * insertion order 1. Hash, 2. Key, 3. Value, 4. Next <Address of the next
 * node>, 5. Previous <Address of the pre, node>
 * <li>Maintain the insertion order due to store the value of the Next and
 * Previous Node
 * 
 * <li>TreeMap, Keys are ordered by sorted order for extending the SortedMap.
 * 
 * @author karth
 *
 */
public class MapInsertionOrder {

	public static void main(String[] args) {

		int[] arrIt = { 1, -1, 2, -2, 0 };

		System.out.println("HashMap, Keys are ordered by in any order");
		HashMap<Integer, String> hm = new HashMap();
		for (int arr : arrIt) {
			// key is arr of arrLt element
			hm.put(arr, Integer.toString(arr));
		}
		for (int k : hm.keySet()) {
			System.out.print(k + ",");
		}
		System.out.println("\nLinkedHashMap, Keys are ordered by insertion order");
		Map<Integer, String> lnkHm = new LinkedHashMap<>();
		for (int arr : arrIt) {
			lnkHm.put(arr, Integer.toString(arr));
		}
		for (int k : lnkHm.keySet()) {
			System.out.print(k + ",");
		}
		System.out.println("\nHashMap, Keys are ordered by sorted order");
		Map<Integer, String> treeMap = new TreeMap();
		for (int arr : arrIt) {
			treeMap.put(arr, Integer.toString(arr));
		}
		for (int k : treeMap.keySet()) {
			System.out.print(k + ",");
		}

	}

}
