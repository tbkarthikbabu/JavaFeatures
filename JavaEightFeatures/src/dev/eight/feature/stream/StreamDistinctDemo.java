package dev.eight.feature.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Sorting and Distinct Using the Stream Feature
 * 
 * @author karth
 *
 */
public class StreamDistinctDemo {

	public static void main(String[] args) {

		Integer[] arrInt = { 2, 3, 1, 5, 2, 4, 5, 1 };
		List<Integer> ltInt = Arrays.asList(arrInt);

		// List maintian the Insertion Order by default
		List<Integer> ltDisInt = ltInt.stream().distinct().collect(Collectors.toList());
		System.out.println("List the values in Insertion Order --> " + ltDisInt);

		// Set maintain the Sorting Order
		Set<Integer> stInt = ltInt.stream().distinct().collect(Collectors.toSet());
		System.out.println("Set the values in Sorting Order -->" + stInt);

		// Key as sorting order and distinct, Values as Count of elements
		// e.g. {1=2, 2=2, 3=1, 4=1, 5=2}
		Map<Integer, Long> mp = ltInt.stream().collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
		System.out.println(mp);
	}

}
