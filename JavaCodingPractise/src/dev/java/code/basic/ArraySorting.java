package dev.java.code.basic;

import java.util.Arrays;

/**
 * 
 * Arrays class from java.util package, it has the sort and toString method
 * 
 * Arrays class implements the comparator interface for sorting
 * 
 * @author karth
 *
 */
public class ArraySorting {

	public static void main(String[] args) {

		int[] inArr = { 1, 2, -1, -2, 0 };
		Arrays.sort(inArr);
		System.out.println(Arrays.toString(inArr));

	}

}
