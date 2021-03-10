package dev.collection.framework;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapWithHashCodeAndEquals {

	public static void main(String[] args) {

		HashMap<Dog, Integer> hm = new HashMap();

		hm.put(new Dog("White"), 10);
		hm.put(new Dog("Blak"), 12);
		hm.put(new Dog("White"), 10);
		hm.put(new Dog("Red"), 10);

		// white cat added twice due to not having the hashcode and equals method to
		// identity the Cat objects with same name

		for (Entry entry : hm.entrySet()) {
			System.out.println(entry.getKey().toString() + "," + entry.getValue());
		}
	}

}

class Dog {

	String color;

	Dog(String c) {
		color = c;
	}

	@Override
	public String toString() {
		return "Dog [color=" + color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

	

}
