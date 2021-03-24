package dev.collection.framework.internallyworks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * HashMap: 1. int hash, 2. K key, 3. V value, 4. Node next
 * 
 * Bucket : A bucket is one element of HashMap array. It is used to store nodes.
 * Two or more nodes can have the same bucket. A single bucket can have more
 * than one nodes, it depends on hashCode() method. The better your hashCode()
 * method is, the better your buckets will be utilized.
 * 
 * index : Hash code of key may be large enough to create an array. hash code
 * generated may be in the range of integer and if we create arrays for such a
 * range, then it will easily cause outOfMemoryException. So we generate index
 * to minimize the size of array. Basically following operation is performed to
 * calculate index.
 * 
 * collision: multilpe nodes are stored into the same index in a bucket
 * 
 * @author karth
 * 
 */
public class HashMapInternallyWorks {

	public static void main(String[] args) {

		// Empty HashMap is created, by default bucket size 16 (0-15)
		Map<Key, Integer> map = new HashMap<>();

		// calc the hashCode value for Sachin key, hashCode # 83, calc the index # 6,
		// Create a node object and place the node objet into index at 6
		map.put(new Key("Sachin"), 99);

		// calc the hashCode value for DavidBegam, hashCode # 68, calc the index # 3,
		// Create a node object and place the node objet into index at 3
		map.put(new Key("DavidBegam"), 77);

		// calc the hashCode value for Dhoni, hashCode # 68, calc the index # 3,
		// Create a node object and place the node objet into index at 3
		map.put(new Key("Dhoni"), 7);

		// 1. In this case already a node object is found at the index 3 – this is case
		// of collision.

		// 2. In that case, check via hashCode() and equals() method that if both the
		// keys are same. If keys are same, replace the value with current value.

		// 3. Otherwise connect this node object to the previous node object via linked
		// list and both are stored at index 3.

		// Without Override the hashcode and equals method in Key class,it retunrs null
		System.out.println("Value for key" + map.get(new Key("Sachin")));

		for (Entry entry : map.entrySet()) {
			System.out.println(entry.getKey().toString() + "," + entry.getValue());
		}
	}
}

class Key {

	String name;

	public Key(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Key [key=" + name + "]";
	}

	/**
	 * hashCode is used to get the hashCode of an object, returns memory reference
	 * of objects in the integer form
	 *
	 */
	@Override
	public int hashCode() {
		// Returns the first character’s ASCII value as hash code.
		// So whenever the first character of key is same, the hash code will be same.
		int hash = (int) name.charAt(0);
		System.out.println("hashCode for name: " + name + " = " + hash);
		return hash;
	}

	/**
	 * equals method is used to check that 2 objects are equal or not. This method
	 * is provided by Object class. You can override this in your class to provide
	 * your own implementation
	 */
	@Override
	public boolean equals(Object obj) {
		return name.equals(((Key) obj).name);
	}

}
