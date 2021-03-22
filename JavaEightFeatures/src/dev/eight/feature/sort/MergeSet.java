package dev.eight.feature.sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * Merge the two set and sorting the values
 * 
 * <li>Hashset internally works HashMap and based on hash value add objects, not
 * maintain any order
 * 
 * <li>LinkedHashSet maintain the insertion order
 * <li>TreeSet maintain the sorting order
 * 
 * @author karth
 *
 */
public class MergeSet {

	public static <T> Set<T> mergeSet(Set<T> a, Set<T> b) {
		return new HashSet<T>() {
			{
				// non-order by using HashMap
				addAll(a);
				addAll(b);
			}
		};
	}

	public static <T> Set<T> mergeSet2(Set<T> a, Set<T> b) {

		// Sorting order by using TreeSet
		Set mergedSet = new TreeSet<T>();
		mergedSet.addAll(a);
		mergedSet.addAll(b);
		return mergedSet;
	}

	public static void main(String[] args) {

		Set<Integer> hSetOdd = new HashSet<>();
		hSetOdd.addAll(Arrays.asList(new Integer[] { 1, 3, 5, 7, 9, 11, 1, 3, 19 }));

		Set<Integer> hSetEven = new HashSet<>();
		hSetEven.addAll(Arrays.asList(new Integer[] { 0, 2, 4, 6, 8 }));

		System.out.println(mergeSet2(hSetOdd, hSetEven));
		System.out.println(mergeSet(hSetOdd, hSetEven));

	}

}
