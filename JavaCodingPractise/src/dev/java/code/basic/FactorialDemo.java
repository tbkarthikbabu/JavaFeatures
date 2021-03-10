package dev.java.code.basic;

/**
 * 
 * Factorial 5!=5*4*3*2*1=120
 * 
 * recursive function calling the same method until it comes to n equal to 1
 * 
 * @author karth
 *
 */
public class FactorialDemo {

	public static void main(String[] args) {

		System.out.println(factorial(5));

	}

	/**
	 * recursive function: call the same function upto reach n==1
	 * 
	 * @param n
	 * @return
	 */
	private static long factorial(long n) {
		if (n == 1)
			return 1;
		else
			return n * factorial(n - 1);
	}
}
