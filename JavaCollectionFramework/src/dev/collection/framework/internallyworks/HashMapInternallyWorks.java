package dev.collection.framework.internallyworks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * HashMap Intrenalwork without using the hashcode and equals method in Custom
 * Key Object
 * 
 * it fails to get the key but it can be iterate the values stroed in map
 * 
 * @author karth
 * 
 *
 */
public class HashMapInternallyWorks {

	public static void main(String[] args) {

		Map<Head, Integer> map = new HashMap<>();

		map.put(new Head("Sachin"), 99);
		map.put(new Head("DavidBegam"), 77);
		map.put(new Head("Dhoni"), 7);

		System.out.println("Value for key" + map.get(new Head("Sachin")));

		for (Entry entry : map.entrySet()) {
			System.out.println(entry.getKey().toString() + "," + entry.getValue());
		}
	}
}

class Key {

	String key;

	public Key(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "Key [key=" + key + "]";
	}

}
