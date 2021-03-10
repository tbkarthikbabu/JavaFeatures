package dev.java.code.collection;

import java.util.LinkedList;

/**
 * 
 * LinkedList: maintain the insertion order
 * 
 * Using the Functional interface and method refernce add the list into another
 * list in desending order
 * 
 * @author karth
 *
 */
public class ReverseLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> link1 = new LinkedList<>();

		link1.add(1);
		link1.add(5);
		link1.add(3);
		System.out.println(link1);

		LinkedList<Integer> link2 = new LinkedList<>();

		link1.descendingIterator().forEachRemaining(link2::add);

		System.out.println(link2);
	}
}
