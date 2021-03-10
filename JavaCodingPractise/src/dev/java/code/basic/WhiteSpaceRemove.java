package dev.java.code.basic;

/**
 * 
 * WhiteSpaceRemove : Character has in build method check for whitespace
 * 
 * @author karth
 *
 */
public class WhiteSpaceRemove {

	public static void main(String[] args) {
		rmvWhiteSpace("malayalam maroma");
	}

	private static void rmvWhiteSpace(String in) {

		StringBuilder build = new StringBuilder();
		char[] charIn = in.toCharArray();
		for (char c : charIn) {
			if (!Character.isWhitespace(c)) {
				build.append(c);
			}
		}
		System.out.println(build);

	}

}
