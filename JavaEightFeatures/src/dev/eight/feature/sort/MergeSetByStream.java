package dev.eight.feature.sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Merge the two set and also it will be sorting the values
 * 
 * @author karth
 *
 */
public class MergeSetByStream {

	public static <T> Set<T> mergeSet(Set<T> a, Set<T> b) {

		//Set<T> mergedSet = a.stream().collect(Collectors.toSet());

		//mergedSet.addAll(b);
		
		Set<T> mergedSet = new HashSet<>();
		
		Stream.of(a,b).forEach(mergedSet::addAll);

		return mergedSet;
	}

	public static void main(String[] args) {

		Set<Integer> a = new HashSet<>();
		a.addAll(Arrays.asList(new Integer[] { 1, 3, 5, 7, 9 }));

		Set<Integer> b = new HashSet<>();
		b.addAll(Arrays.asList(new Integer[] { 0, 2, 4, 6, 8 }));

		System.out.println(mergeSet(a, b));

	}

}
