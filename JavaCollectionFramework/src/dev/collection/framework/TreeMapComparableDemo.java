package dev.collection.framework;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * @author karth
 * 
 *         Exception in thread "main" java.lang.ClassCastException:
 *         com.test.list.Tree cannot be cast to java.lang.Comparable
 *
 *         No need of adding the HashCode and Equals methods in TreeMap due to
 *         TreeMap implements AbstractMap its override the hashcode and equals
 *         method
 */
public class TreeMapComparableDemo {

	public static void main(String[] args) {

		Map<Tree, Integer> treeMap = new TreeMap();

		treeMap.put(new Tree("Neem", 1), 10);
		treeMap.put(new Tree("Rosewood", 2), 12);
		treeMap.put(new Tree("Teak", 3), 20);
		treeMap.put(new Tree("Neem", 1), 10);

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

	public int compareTo(Tree o) {
		return o.size - this.size;

	}

}
