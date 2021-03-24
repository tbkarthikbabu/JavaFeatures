package dev.collection.framework.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConverter {

	public static void main(String[] args) {

		String[] arrStr = { "Karthi", "Priyanka", "Shas" };

		String str = Arrays.toString(arrStr);
		System.out.println(str);

		List<String> ltStr = Arrays.asList(arrStr);
		System.out.println(ltStr);

		List<String> ltStr2 = new ArrayList<>();
		ltStr2.add("Vinod");
		ltStr2.add("Ravi");
		System.out.println(ltStr2);

		// forEach method for iterating the list, pass the method refernce
		ltStr2.forEach(System.out::println);

		// iterate the list using the stream foreach, lambda expr to print the values
		ltStr2.stream().forEach((c) -> System.out.println(c));

		ltStr2.stream().forEach(System.out::println);

		// multi thread running for iterating the list, for making performance
		ltStr2.parallelStream().forEach(System.out::println);

		Object[] arrStr2 = ltStr2.toArray();
		System.out.println(Arrays.toString(arrStr2));
	}

}
