package dev.java.code.basic;

/**
 * 
 * Java methods parameters only pass the values not references
 * 
 * so that, this proof that send the value of x, not x.
 * 
 * it will not change the values of x
 * 
 * @author karth
 *
 */
public class SwapNumbers {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.printf("\n x is %d, y is %d", x, y);
		String str = swapNumber(x, y);
		String[] st = str.split(",");
		x = Integer.parseInt(st[0]);
		y = Integer.parseInt(st[1]);
		System.out.printf("\n x is %d, y is %d", x, y);
	}

	static String swapNumber(int a, int b) {
		b = a + b;
		a = b - a;
		b = b - a;
		return a + "," + b;
	}

}
