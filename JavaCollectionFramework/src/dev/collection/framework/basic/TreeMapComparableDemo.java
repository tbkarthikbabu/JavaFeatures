package dev.collection.framework.basic;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * 
 * TreeMap: it extends AbstractMap, override the hashCode and equal methods by
 * default
 * 
 * ClassCastException Exception: throws in Tree class cannot be cast to
 * java.lang.Comparable
 * 
 * <li>Due to ClassCastException, implementing the Comparable interface in Tree
 * class. so that, sorting the elements
 * 
 * <li>String, Integer.. Wrapper classes are by default implements Comparable.
 * 
 * @author karth
 * 
 */
public class TreeMapComparableDemo {

	public static void main(String[] args) {

		Map<Tree, Integer> treeMap = new TreeMap();
		treeMap.put(new Tree("Neem", 1), 12);
		treeMap.put(new Tree("Rosewood", 2), 30);
		treeMap.put(new Tree("Teak", 3), 20);
		treeMap.put(new Tree("Neem", 1), 10);

		// overrides the latest/new values of Tree Object due to by default
		// override the hashCode and equal methods

		for (Entry entry : treeMap.entrySet()) {
			System.out.println(entry.getKey().toString() + "," + entry.getValue());
		}
	}

}

class Tree implements Comparable<Tree> {

	String color;
	int size;

	public Tree(String color, int size) {
		this.color = color;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Tree [color=" + color + ", size=" + size + "]";
	}

	// For Sorting the elements based on the size in Tree class
	public int compareTo(Tree o) {
		return o.size - this.size;

	}

}
