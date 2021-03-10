package dev.eight.feature.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDistinctDemo {

	public static void main(String[] args) {

		Integer[] arrInt = { 1, 2, 3, 4, 5, 2, 4 };

		List<Integer> ltInt = Arrays.asList(arrInt);

		List<Integer> ltDisInt = ltInt.stream().distinct().collect(Collectors.toList());

		System.out.println(ltDisInt);

		Set<Integer> stInt = ltInt.stream().distinct().collect(Collectors.toSet());

		System.out.println(stInt);

		Map<Integer, Long> mp = ltInt.stream().collect(Collectors.toMap(Function.identity(), v->1L,Long::sum));

		System.out.println(mp);
	}

}
