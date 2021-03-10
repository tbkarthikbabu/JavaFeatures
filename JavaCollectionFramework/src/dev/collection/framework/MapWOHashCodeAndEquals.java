package dev.collection.framework;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author karth white cat added twice due to not having the hashcode and equals
 *         method to identity the Cat objects with same name
 *
 */
public class MapWOHashCodeAndEquals {

	public static void main(String[] args) {

		HashMap<Dog, Integer> hm = new HashMap();

		hm.put(new Dog("White"), 10);
		hm.put(new Dog("Blak"), 12);
		hm.put(new Dog("White"), 20);
		hm.put(new Dog("Red"), 10);

		for (Entry entry : hm.entrySet()) {
			System.out.println(entry.getKey().toString() + "," + entry.getValue());
		}
	}

}

class Cat {

	String color;

	Cat(String c) {
		color = c;
	}

	@Override
	public String toString() {
		return "Cat [color=" + color + "]";
	}

}
