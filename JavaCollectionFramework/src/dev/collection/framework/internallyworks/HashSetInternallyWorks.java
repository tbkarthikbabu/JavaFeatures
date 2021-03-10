package dev.collection.framework.internallyworks;

import java.util.Collection;
import java.util.HashSet;

/**
 * 
 * Hashset internall works like HashMap
 * 
 * it checks the element PRESENT or NOT when calling add method, add method
 * internall calls PUT method of HashMap and hashSet construcotr created the
 * object of HashMap
 * 
 * public HashSet() { map = new HashMap<>(); }
 * 
 * public boolean add(E e) { return map.put(e, PRESENT)==null; }
 * 
 * @author karth
 * 
 *
 */
public class HashSetInternallyWorks {

	public static void main(String[] args) {

		Collection<String> set = new HashSet();

		set.add("Karthi");
		set.add("Vinod");
		set.add("Karthi");
		set.add("Ravi");
		set.add("Ravi");

		System.out.println(set);
	}

}
