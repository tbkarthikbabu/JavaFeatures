package dev.java.code.basic;

public class ThirdHighestValue {

	public static void main(String[] args) {

		int[] in = { 1, 2, 3, 4, 2, 3 };
		System.out.println(findSecondHighest(in));
	}

	static int findSecondHighest(int[] n) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		for (int i : n) {
			if (i > first) {
				second = first;
				first = i;
			} else if (i > second) {
				third = second;
				second = i;
			} else if (i > third) {
				third = i;
			}

		}
		return second;

	}

}
