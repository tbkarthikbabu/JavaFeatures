package dev.java.code.basic;

/**
 * @author karth
 * 
 *         1. StringBuilder for unsynchorinzed 2. index starts from 0, so reduce
 *         from by ch1.length - 1
 *
 */
public class StringReverseByCharArray {

	public static void main(String[] args) {

		String str1 = "abc";
		System.out.println(reverse(str1));
	}

	private static String reverse(String str1) {

		if (str1 == null)
			throw new IllegalArgumentException("Null is not valid");

		/*
		 * Coding Standard By Sonar: Replace the synchronized class "StringBuffer" by an
		 * unsynchronized one such as "StringBuilder". StringBuffer is an synchronized
		 * and legacy but StringBuilder is an unsynchronized
		 */

		StringBuilder sb = new StringBuilder();
		char[] ch1 = str1.toCharArray();
		for (int i = ch1.length - 1; i >= 0; i--) {
			sb.append(ch1[i]);
		}
		return sb.toString();
	}

}
