package dev.collection.framework.internallyworks;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Internally: HashSet internally works like HashMap because of hashSet
 * constructor create object of the HashMap.
 * 
 * i.e. public HashSet() { map = new HashMap<>(); }
 * 
 * Not allow the duplicate: Removes the duplicate entry/objects by using the
 * checks the element PRESENT or NOT. When calling add method, Add method
 * internally calls PUT method of HashMap, if object is PRESENT, it wont be
 * added again.
 * 
 * i.e. public boolean add(E e) { return map.put(e, PRESENT)==null; }
 * 
 * @author karth
 * 
 *
 */
public class HashSetInternallyWorks {

	public static void main(String[] args) {

		Set<String> set = new HashSet();
		set.add("Karthi");
		set.add("Vinod");
		set.add("Karthi");
		set.add("Ravi");
		set.add("Ravi");

		System.out.println(set);
	}

}
