package dev.java.code.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * StringCount : convert into the charArray and store values into HashMap
 * 
 * @author karth
 *
 */
public class StringCharCount {

	public static void main(String[] args) {

		String str1 = "adAbbdddcCC";

		char[] chars = str1.toCharArray();

		Map<Character, Integer> mapCharCt = new HashMap<>();

		for (Character ch : chars) {
			if (mapCharCt.containsKey(ch)) {
				// existing values and override the key and increment the values into map
				mapCharCt.put(ch, mapCharCt.get(ch) + 1);
			} else {
				// first new values into map
				mapCharCt.put(ch, 1);
			}

		}

		System.out.println(mapCharCt);
	}

}
