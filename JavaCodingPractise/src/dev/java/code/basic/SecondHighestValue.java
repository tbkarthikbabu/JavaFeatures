package dev.java.code.basic;

public class SecondHighestValue {

	public static void main(String[] args) {

		int[] in = { 1, 2, 3, 4, 2, 3 };
		System.out.println(findSecondHighest(in));
	}

	static int findSecondHighest(int[] n) {
		// dummy two values for stroting first and second values and set the
		// Integer.Minimum values for intialization
		// default int value -21313131313
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int i : n) {
			if (i > first) {
				second = first;
				first = i;
			} else if (i > second) {
				second = i;
			}

		}
		return second;

	}

}
