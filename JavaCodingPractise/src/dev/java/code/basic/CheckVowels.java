package dev.java.code.basic;

/**
 * 
 * matches method return boolean
 * 
 * @author karth
 *
 */
public class CheckVowels {

	public static void main(String[] args) {
		System.out.println(checkVowels("TV"));
	}

	private static boolean checkVowels(String in) {
		boolean isVowel = in.toLowerCase().matches(".*[aeiou].*");
		return isVowel;
	}

}
