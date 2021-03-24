package dev.collection.framework.advanced;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * <li>Fail-Fast means that to occur the Concurrent Modification Exception on
 * interting the list or Map
 * 
 * Concurrent Modification Exception throws, when a thread iteratee the
 * collection and another thread to modify the same collection at the same time.
 * 
 * <li>To avoid this exception during the iterate the ArrayList and HashMap, can
 * use the CopyOnWriteArrayList, ConcurrentHashMap classes.
 * 
 * <li>Non-Fail-Fast, can be defined as Fail-Safe for avoid the Concurrent
 * Modification.
 * 
 * @author karth
 *
 */
public class ConcurrentModificationDemo {

	public static void main(String[] args) {

		// Concurrent Modification Exception Throws for HashMap
		Map<String, String> cityCode = new HashMap<String, String>();
		cityCode.put("Delhi", "India");
		cityCode.put("Moscow", "Russia");
		cityCode.put("New York", "USA");
		Iterator iterator = cityCode.keySet().iterator();
		try {
			while (iterator.hasNext()) {
				System.out.println(cityCode.get(iterator.next()));
				// adding the element while the iterate the same collections
				cityCode.put("Istanbul", "Turkey");
			}

		} catch (ConcurrentModificationException conEx) {
			conEx.printStackTrace();
		}

		// Concurrent Modification Exception Throws for ArrayList
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);

		// remove an element via Iterator remove() method, exception will not be thrown.
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			if (itr.next() == 2) {
				// will not throw Exception
				itr.remove();
			}
		}
		System.out.println(al);

		// removing via a particular collection remove() method,
		// ConcurrentModificationException will be thrown
		try {
			itr = al.iterator();
			while (itr.hasNext()) {
				if (itr.next() == 3) {
					// will throw Exception on next call
					al.remove(3);
				}
			}
		} catch (ConcurrentModificationException conEx) {
			conEx.printStackTrace();
		}

		// To avoid the exception, to this operation as Fail-Safe
		// CopyOnWriteArrayList for doing this fail-safe for this operation/ requirment
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
		Iterator itr1 = list.iterator();
		while (itr1.hasNext()) {
			Integer no = (Integer) itr1.next();
			System.out.println(no);
			if (no == 8)
				// This will not print,hence it has created separate copy
				// Not Reflect, Not Added
				list.add(14);
		}

		// Creating a ConcurrentHashMap
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);

		// Getting an Iterator from map
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " : " + map.get(key));
			// This will reflect in iterator.Hence, it has not created separate copy
			// Reflect. Added
			map.put("SEVEN", 7);
		}
	}
}
