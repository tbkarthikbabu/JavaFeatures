package dev.eight.feature.sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Merge the two set and sorting the values
 * 
 * <li>Hashset internally works HashMap and based on hash value add objects, not
 * maintain any order
 * 
 * Stream:
 * 
 * @author karth
 *
 */
public class MergeSetByStream {

	public static <T> Set<T> mergeSet(Set<T> a, Set<T> b) {

		Set<T> mergedSet = a.stream().collect(Collectors.toSet());
		mergedSet.addAll(b);
		return mergedSet;
	}

	public static <T> Set<T> mergeSet2(Set<T> a, Set<T> b) {

		Set<T> mergedSet = new TreeSet<>();
		Stream.of(a, b).forEach(mergedSet::addAll);
		return mergedSet;
	}

	public static void main(String[] args) {

		Set<Integer> hSet1 = new HashSet<>();
		hSet1.addAll(Arrays.asList(new Integer[] { 1, 3, 5, 7, 9, 7, 5, 11, 19 }));

		Set<Integer> hSet2 = new HashSet<>();
		hSet2.addAll(Arrays.asList(new Integer[] { 0, 2, 4, 6, 8 }));

		System.out.println("HashSet Hasing Order -->" + mergeSet(hSet1, hSet2));

		System.out.println("TreeSet Sorting Order -->" + mergeSet2(hSet1, hSet2));

	}

}
