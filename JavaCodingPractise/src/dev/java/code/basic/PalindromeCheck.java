package dev.java.code.basic;

/**
 * 
 * PalindromeCheck : check the string the same if it's reverse order .
 * 
 * @author karth
 *
 */
public class PalindromeCheck {

	public static void main(String[] args) {
		System.out.println("PalindromeCheck ->" + isPalindrome("malayalam"));
	}

	private static boolean isPalindrome(String in) {

		int inLeng = in.length();

		for (int i = 0; i < inLeng / 2; i++) {
			if (in.charAt(i) == in.charAt(inLeng - 1)) {
				return true;
			}
		}

		return false;
	}

}
