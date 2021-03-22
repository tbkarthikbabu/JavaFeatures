package dev.eight.feature.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<String> names = Arrays.asList("Karthi", "Ravi", "Aswin");

		// square of numbers and to converted as list
		List<Integer> square = numbers.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(square);

		Set<Integer> square2 = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println(square2);

		List<String> rLt = names.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList());
		System.out.println(rLt);

		// square of numbers and iterate and print as formatted structure
		numbers.stream().map(x -> x * x).forEach(y -> System.out.print(y + ","));

	}

}
