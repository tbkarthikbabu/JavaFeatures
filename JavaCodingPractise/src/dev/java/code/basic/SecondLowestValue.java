package dev.java.code.basic;

public class SecondLowestValue {

	public static void main(String[] args) {

		int[] in = { 1, 2, 3, 4, 2, 3 };
		System.out.println(findSecondHighest(in));
	}

	static int findSecondHighest(int[] n) {
		int lowest = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;

		for (int i : n) {
			if (i < lowest) {
				second = lowest;
				lowest = i;
			} else if (i < second) {
				second = i;
			}

		}
		return second;

	}

}
