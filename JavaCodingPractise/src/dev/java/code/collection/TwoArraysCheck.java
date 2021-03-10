package dev.java.code.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoArraysCheck {

	public static void main(String[] args) {

		Integer[] arr1 = { 1, 2, 3 };
		Integer[] arr2 = { 3, 2, 1 };

		System.out.println(chkTwoArrays(arr1, arr2));

	}

	/**
	 * 
	 * Object is an dynamic input class type so can map to any datatype
	 * 
	 * @return
	 */
	private static boolean chkTwoArrays(Object[] arr1, Object[] arr2) {

		// to make the unique values in the list using set
		Set<Object> uniquelist1 = new HashSet<>(Arrays.asList(arr1));

		Set<Object> uniquelist2 = new HashSet<>(Arrays.asList(arr2));

		if (uniquelist1.size() != uniquelist2.size()) {
			return false;
		}

		// iterate one uniqueList and check into the iterated values to another
		// uniqueList using the contains method
		for (Object obj : uniquelist1) {
			if (!uniquelist2.contains(obj)) {
				return false;

			}
		}
		return true;
	}

}
