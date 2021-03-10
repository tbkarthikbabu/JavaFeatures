package dev.collection.framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * HashMap, Keys are ordered by in any order LinkedHashMap, Keys are ordered by
 * insertion order HashMap, Keys are ordered by sorted order
 * 
 * @author karth
 *
 */
public class MapInsertionOrder {

	public static void main(String[] args) {

		int[] arrIt = { 1, -1, 2, -2, 0 };

		System.out.println("HashMap, Keys are ordered by in any order");
		HashMap<Integer, String> hm = new HashMap();
		for (int i : arrIt) {
			hm.put(i, Integer.toString(i));
		}
		for (int k : hm.keySet()) {
			System.out.print(k + ",");
		}
		System.out.println("\nLinkedHashMap, Keys are ordered by insertion order");
		Map<Integer, String> lnkHm = new LinkedHashMap<>();
		for (int i : arrIt) {
			lnkHm.put(i, Integer.toString(i));
		}
		for (int k : lnkHm.keySet()) {
			System.out.print(k + ",");
		}
		System.out.println("\nHashMap, Keys are ordered by sorted order");
		Map<Integer, String> treeMap = new TreeMap();
		for (int i : arrIt) {
			treeMap.put(i, Integer.toString(i));
		}
		for (int k : treeMap.keySet()) {
			System.out.print(k + ",");
		}

	}

}
