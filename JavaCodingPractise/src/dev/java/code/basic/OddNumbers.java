package dev.java.code.basic;

public class OddNumbers {

	public static void main(String[] args) {

		printOddNumbers(10);
	}

	static void printOddNumbers(int n) {

		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}

	}

}
