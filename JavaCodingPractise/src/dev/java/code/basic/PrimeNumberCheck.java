package dev.java.code.basic;

/**
 * 
 * Prime Number: a number that is divisible only by itself and 1.
 * 
 * @author karth
 *
 */
public class PrimeNumberCheck {

	public static void main(String[] args) {
		System.out.println("Prime Number 19 ->" + isPrime(19));
		System.out.println("Prime Number 20 ->" + isPrime(20));
	}

	private static boolean isPrime(int in) {

		if (in == 0 || in == 1)
			return false;
		if (in == 2)
			return true;
		// for loop, cond: smaller than & equal for increment order
		for (int i = 2; i <= in / 2; i++) {
			if (in % i == 0) {
				return false;
			}
		}

		return true;
	}

}
