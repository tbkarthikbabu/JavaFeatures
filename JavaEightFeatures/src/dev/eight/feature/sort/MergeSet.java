package dev.eight.feature.sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * Merge the two set and also it will be sorting the values
 * 
 * @author karth
 *
 */
public class MergeSet {

	public static <T> Set<T> mergeSet(Set<T> a, Set<T> b) {
		return new HashSet<T>() {
			{
				addAll(a);
				addAll(b);
			}
		};
	}

	public static <T> Set<T> mergeSet2(Set<T> a, Set<T> b) {
		Set mergedSet = new HashSet<T>();

		mergedSet.addAll(a);
		mergedSet.addAll(b);

		return mergedSet;
	}

	public static void main(String[] args) {

		Set<Integer> a = new HashSet<>();
		a.addAll(Arrays.asList(new Integer[] { 1, 3, 5, 7, 9 }));

		Set<Integer> b = new HashSet<>();
		b.addAll(Arrays.asList(new Integer[] { 0, 2, 4, 6, 8 }));

		System.out.println(mergeSet2(a, b));

	}

}
