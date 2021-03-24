package dev.collection.framework.internallyworks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * HashMap: If not override the hashCode and equals methods in key object of
 * HashMap, it fails to get the valus using the get() methods
 * 
 * so that need to be override the hashCode and equals methods in HashMap Key
 * 
 * @author karth
 *
 */
public class HashMapWithHashCodeAndEquals {

	public static void main(String[] args) {

		Map<Head, Integer> map = new HashMap<>();
		map.put(new Head("Sachin"), 99);
		map.put(new Head("DavidBegam"), 77);
		map.put(new Head("Dhoni"), 7);

		// Without Override the hashcode and equals method in Head class,it retunrs null
		System.out.println("Value for key" + map.get(new Head("Sachin")));

		// Successfully iterate the values, even or not override the hashcode and equals
		for (Entry entry : map.entrySet()) {
			System.out.println(entry.getKey().toString() + "," + entry.getValue());
		}
	}
}

class Head {

	String name;

	public Head(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Head [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		// hashCode value logic, if key value starts with same alphabets, then hash
		// value is same for both names
		int hash = (int) name.charAt(0);
		System.out.println("hashCode for name: " + name + " = " + hash);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		return name.equals(((Head) obj).name);
	}

}
