package dev.collection.framework;

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
		
		ltStr2.forEach(System.out::println);
		
		ltStr2.stream().forEach((c)-> System.out.println(c));
		
		ltStr2.stream().forEach(System.out::println);
		
		Object[] arrStr2 = ltStr2.toArray();
		System.out.println(Arrays.toString(arrStr2));
	}

}
